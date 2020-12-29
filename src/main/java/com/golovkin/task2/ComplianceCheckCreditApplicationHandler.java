package com.golovkin.task2;

import com.golovkin.task2.domain.Credit;
import com.golovkin.task2.domain.CreditApplication;

public class ComplianceCheckCreditApplicationHandler implements CreditApplicationHandler {
    private CreditApplicationHandler next;

    private boolean checkCompliance(CreditApplication creditApplication) {
        boolean areAllCreditsPaid = creditApplication.getPreviousCredits().stream().allMatch(Credit::isPaid);
        boolean isEmployed = !creditApplication.getCurrentJob().equals("");

        return areAllCreditsPaid && isEmployed;
    }

    @Override
    public boolean handle(CreditApplication creditApplication) {
        boolean isCheckCompliancePassed = checkCompliance(creditApplication);

        if (isCheckCompliancePassed) {
            System.out.println("Копмплаенс проверка пройдена!");
        } else {
            System.out.println("Комплаенса проверка не пройдена");
        }

        if (isCheckCompliancePassed && next != null) {
            return next.handle(creditApplication);
        } else {
            return isCheckCompliancePassed;
        }
    }

    @Override
    public void setNext(CreditApplicationHandler next) {
        this.next = next;
    }
}
