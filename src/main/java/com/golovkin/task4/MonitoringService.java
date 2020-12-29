package com.golovkin.task4;

public class MonitoringService {
    private static MonitoringService instance;

    private MonitoringService() {
    }

    public static MonitoringService getInstance() {
        if (instance == null) {
            instance = new MonitoringService();
        }

        return instance;
    }

    public void receiveMessage(String message) {
        System.out.printf("MonitoringService: %s\n", message);
    }
}
