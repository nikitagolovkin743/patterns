package com.golovkin.task4;

import com.golovkin.task4.domain.CreditApplication;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class HistoryServiceImpl implements HistoryService {
    private Map<Integer, CreditApplication> creditApplications;

    public HistoryServiceImpl() {
        creditApplications = new HashMap<>();
    }

    @Override
    public CreditApplication createCreditApplication(String firstName, String lastName) {
        CreditApplication creditApplication = new CreditApplication();
        creditApplication.setBalance(BigDecimal.ZERO);
        creditApplication.setFirstName(firstName);
        creditApplication.setLastName(lastName);

        creditApplications.put(creditApplication.getId(), creditApplication);

        return creditApplication;
    }

    @Override
    public boolean updateCreditApplication(int id, BigDecimal newBalance) {
        CreditApplication application = getCreditApplication(id);

        if (application == null) {
            return false;
        }

        application.setBalance(newBalance);

        return true;
    }

    @Override
    public CreditApplication getCreditApplication(int id) {
        return creditApplications.get(id);
    }
}
