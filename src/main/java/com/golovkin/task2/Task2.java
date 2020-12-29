package com.golovkin.task2;

import com.golovkin.task2.domain.CreditApplication;
import com.golovkin.task2.domain.EducationType;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {
        CreditApplicationHandler creditApplicationChain = createCreditApplicationChain();

        CreditApplication creditApplication = getCreditApplication();

        boolean isCreditApplicationHandled = creditApplicationChain.handle(creditApplication);

        if (isCreditApplicationHandled) {
            System.out.println("Заявка одобрена");
        } else {
            System.out.println("Заявка отклонена");
        }
    }

    private static CreditApplication getCreditApplication() {
        CreditApplication creditApplication = new CreditApplication();
        creditApplication.setFirstName("Ivan");
        creditApplication.setMiddleName("Maximovich");
        creditApplication.setLastName("Ivanov");
        creditApplication.setMarried(false);

        creditApplication.setAddress("Ryazan");
        creditApplication.setPhoneNumber("+79009010150");
        creditApplication.setPassportNumber("6117 748945");

        creditApplication.setMonthlyIncome(BigDecimal.valueOf(40_000));

        creditApplication.setCreditPercent(new BigDecimal("23.9"));
        creditApplication.setAmount(BigDecimal.valueOf(1_000_000));
        creditApplication.setMonthlyPayment(BigDecimal.valueOf(4_000));
        creditApplication.setYears(20);

        creditApplication.setEducationType(EducationType.UNIVERSITY);
        creditApplication.setCurrentJob("Auchan");

        creditApplication.setPreviousCredits(new ArrayList<>());

        return creditApplication;
    }

    private static CreditApplicationHandler createCreditApplicationChain() {
        CreditApplicationHandler applicationCheckCreditApplicationHandler = new ApplicationFullnessCheckCreditApplicationHandler();
        CreditApplicationHandler complianceCheckCreditApplicationHandler = new ComplianceCheckCreditApplicationHandler();
        CreditApplicationHandler makeDecisionCreditApplicationHandler = new MakeDecisionCreditApplicationHandler();

        applicationCheckCreditApplicationHandler.setNext(complianceCheckCreditApplicationHandler);
        complianceCheckCreditApplicationHandler.setNext(makeDecisionCreditApplicationHandler);

        return applicationCheckCreditApplicationHandler;
    }
}
