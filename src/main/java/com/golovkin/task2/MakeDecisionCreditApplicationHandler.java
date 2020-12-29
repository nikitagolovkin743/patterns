package com.golovkin.task2;

import com.golovkin.task2.domain.CreditApplication;

import java.math.BigDecimal;

public class MakeDecisionCreditApplicationHandler implements CreditApplicationHandler {
    private final BigDecimal MINIMAL_MONTHLY_INCOME = BigDecimal.valueOf(40_000);
    private CreditApplicationHandler next;

    private boolean shouldGiveCredit(CreditApplication creditApplication) {
        boolean isMonthlyIncomeEnough = creditApplication.getMonthlyIncome().compareTo(MINIMAL_MONTHLY_INCOME) != -1;

        return isMonthlyIncomeEnough;
    }

    @Override
    public boolean handle(CreditApplication creditApplication) {
        boolean shouldGiveCredit = shouldGiveCredit(creditApplication);

        if (shouldGiveCredit) {
            System.out.println("Принято положительное решение по кредитной заявке!");
        } else {
            System.out.println("Недостаточный ежемесячный доход");
        }

        if (shouldGiveCredit && next != null) {
            return next.handle(creditApplication);
        } else {
            return shouldGiveCredit;
        }
    }

    @Override
    public void setNext(CreditApplicationHandler next) {
        this.next = next;
    }
}
