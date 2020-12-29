package com.golovkin.task2;

import com.golovkin.task2.domain.CreditApplication;

public class ApplicationFullnessCheckCreditApplicationHandler implements CreditApplicationHandler {
    private CreditApplicationHandler next;

    private boolean areRequiredFieldsFilled(CreditApplication creditApplication) {
        Object[] requiredFields = {
                creditApplication.getFirstName(),
                creditApplication.getMiddleName(),
                creditApplication.getLastName(),
                creditApplication.getAddress(),
                creditApplication.getPhoneNumber(),
                creditApplication.getPassportNumber(),
                creditApplication.getMonthlyIncome(),
                creditApplication.getCreditPercent(),
                creditApplication.getAmount(),
                creditApplication.getMonthlyPayment(),
                creditApplication.getYears(),
                creditApplication.getEducationType(),
                creditApplication.getCurrentJob(),
                creditApplication.getPreviousCredits()
        };

        return !isAnyObjectNull(requiredFields);
    }

    private boolean isAnyObjectNull(Object... objects) {
        for (Object object : objects) {
            if (object == null)
                return true;
        }

        return false;
    }

    @Override
    public boolean handle(CreditApplication creditApplication) {
        boolean areRequiredFieldsFilled = areRequiredFieldsFilled(creditApplication);

        if (areRequiredFieldsFilled) {
            System.out.println("Проверка на полноту заполнения заявки пройдена!");
        } else {
            System.out.println("Не все обязательные поля заполнены");
        }

        if (areRequiredFieldsFilled && next != null) {
            return next.handle(creditApplication);
        } else {
            return areRequiredFieldsFilled;
        }
    }

    @Override
    public void setNext(CreditApplicationHandler next) {
        this.next = next;
    }
}
