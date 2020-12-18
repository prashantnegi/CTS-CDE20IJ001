package com.cts.training.investment;

import com.cts.training.model.Account;
import lombok.NoArgsConstructor;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Currency;

@NoArgsConstructor
public class ExternalInvestmentManagementService implements InvestmentManagementService{

    public static final MathContext MATH_CONTEXT = new MathContext(34, RoundingMode.DOWN);

    @Override
    public void addFunds(Account account, BigDecimal investmentAmount, Currency investmentCcy) {

    }

    @Override
    public boolean buyInvestmentFund(Account account, String fundId, BigDecimal investmentAmount) throws IOException {
        return false;
    }

    @Override
    public boolean sellInvestmentFund(Account account, String fundId, BigDecimal investmentAmount) throws IOException {
        return false;
    }
}
