package com.golovkin.task4;

public class AuditService {
    private static AuditService instance;

    private AuditService() {
    }

    public static AuditService getInstance() {
        if (instance == null) {
            instance = new AuditService();
        }

        return instance;
    }

    public void receiveMessage(String message) {
        System.out.printf("AuditService: %s\n", message);
    }
}
