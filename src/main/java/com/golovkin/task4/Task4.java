package com.golovkin.task4;

import com.golovkin.task4.domain.CreditApplication;

import java.math.BigDecimal;

public class Task4 {
    public static void main(String[] args) {
        HistoryService historyService = new HistoryServiceImpl();
        HistoryService historyServiceProxy = new HistoryServiceProxy(historyService);

        CreditApplication creditApplication = historyServiceProxy.createCreditApplication("Ivan", "Ivanov");
        System.out.printf("Заявка: %s\n", creditApplication);
        historyServiceProxy.updateCreditApplication(1, BigDecimal.valueOf(1_000));
        System.out.printf("Заявка: %s\n", creditApplication);
        CreditApplication creditApplicationById = historyServiceProxy.getCreditApplication(1);
        System.out.printf("Заявка: %s\n", creditApplicationById);
    }
}
