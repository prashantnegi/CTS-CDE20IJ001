package com.cts.training.core;

import lombok.AllArgsConstructor;

import java.io.IOException;
import java.time.LocalDate;

@AllArgsConstructor
public class AccountOpeningService {

    static final String UNACCEPTABLE_RISK_PROFILE = "HIGH";
    private BackgroundCheckService backgroundCheckService;
    private ReferenceIdsManager referenceIdsManager;
    private AccountRepository accountRepository;
    private AccountOpeningEventPublisher eventPublisher;

    public AccountOpeningStatus openAccount(String firstName, String lastName, String taxId, LocalDate dob)
            throws IOException {

        final BackgroundCheckResults backgroundCheckResults = backgroundCheckService.confirm(firstName,
                lastName,
                taxId,
                dob);

        if (backgroundCheckResults == null || backgroundCheckResults.getRiskProfile().equals(UNACCEPTABLE_RISK_PROFILE)) {
            return AccountOpeningStatus.DECLINED;
        } else {
            final String id = referenceIdsManager.obtainId(firstName, "", lastName, taxId, dob);
            if (id != null) {
                accountRepository.save(id, firstName, lastName, taxId, dob, backgroundCheckResults);
                eventPublisher.notify(id);
                return AccountOpeningStatus.OPENED;
            } else {
                return AccountOpeningStatus.DECLINED;
            }
        }
    }
}
