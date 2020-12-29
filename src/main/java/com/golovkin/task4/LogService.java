package com.golovkin.task4;

public class LogService {
    private static LogService instance;

    private LogService() {
    }

    public static LogService getInstance() {
        if (instance == null) {
            instance = new LogService();
        }

        return instance;
    }

    public void receiveMessage(String message) {
        System.out.printf("LogService: %s\n", message);
    }
}
