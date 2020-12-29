package com.golovkin.task4;

import com.golovkin.task4.domain.CreditApplication;

import java.math.BigDecimal;

public class HistoryServiceProxy implements HistoryService {
    private HistoryService historyService;

    public HistoryServiceProxy(HistoryService historyService) {
        this.historyService = historyService;
    }

    @Override
    public CreditApplication createCreditApplication(String firstName, String lastName) {
        String beforeMethodMessage = "HistoryService собирается создать кредитную заявку";
        String afterMethodMessage = "HistoryService создал кредитную заявку";

        LogService.getInstance().receiveMessage(beforeMethodMessage);
        MonitoringService.getInstance().receiveMessage(beforeMethodMessage);
        AuditService.getInstance().receiveMessage(beforeMethodMessage);

        CreditApplication creditApplication = historyService.createCreditApplication(firstName, lastName);

        LogService.getInstance().receiveMessage(afterMethodMessage);
        MonitoringService.getInstance().receiveMessage(afterMethodMessage);
        AuditService.getInstance().receiveMessage(afterMethodMessage);

        return creditApplication;
    }

    @Override
    public boolean updateCreditApplication(int id, BigDecimal newBalance) {
        String beforeMethodMessage = String.format("HistoryService собирается обновить кредитную заявку %d. Новый баланс: %s", id, newBalance);
        String afterMethodMessage = String.format("HistoryService обновил кредитную заявку %d. Новый баланс: %s", id, newBalance);

        LogService.getInstance().receiveMessage(beforeMethodMessage);
        MonitoringService.getInstance().receiveMessage(beforeMethodMessage);
        AuditService.getInstance().receiveMessage(beforeMethodMessage);

        boolean isUpdated = historyService.updateCreditApplication(id, newBalance);

        LogService.getInstance().receiveMessage(afterMethodMessage);
        MonitoringService.getInstance().receiveMessage(afterMethodMessage);
        AuditService.getInstance().receiveMessage(afterMethodMessage);

        return isUpdated;
    }

    @Override
    public CreditApplication getCreditApplication(int id) {
        String beforeMethodMessage = String.format("HistoryService собирается получить кредитную заявку %d", id);
        String afterMethodMessage = String.format("HistoryService получил кредитную заявку %d", id);

        LogService.getInstance().receiveMessage(beforeMethodMessage);
        MonitoringService.getInstance().receiveMessage(beforeMethodMessage);
        AuditService.getInstance().receiveMessage(beforeMethodMessage);

        CreditApplication creditApplication = historyService.getCreditApplication(id);

        LogService.getInstance().receiveMessage(afterMethodMessage);
        MonitoringService.getInstance().receiveMessage(afterMethodMessage);
        AuditService.getInstance().receiveMessage(afterMethodMessage);

        return creditApplication;
    }
}
