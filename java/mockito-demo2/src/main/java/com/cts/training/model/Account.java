package com.cts.training.model;

import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Currency;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Account {

    private String id;
    private String fistName;
    private String lastName;
    private LocalDate dob;
    private String taxId;
    private long totalInvestmentValue;
    private Currency ccy;
    private Set<String> investments;
    private long availableCash;
    private LocalDateTime expectedRetirement;
}


