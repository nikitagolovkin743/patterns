package com.golovkin.task4;

import com.golovkin.task4.domain.CreditApplication;

import java.math.BigDecimal;

public interface HistoryService {
    CreditApplication createCreditApplication(String firstName, String lastName);

    boolean updateCreditApplication(int id, BigDecimal newBalance);

    CreditApplication getCreditApplication(int id);
}
