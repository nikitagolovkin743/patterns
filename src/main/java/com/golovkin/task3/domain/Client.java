package com.golovkin.task3.domain;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private String name;
    private List<String> notifications;

    public Client(String name) {
        this.name = name;
        notifications = new ArrayList<>();
    }

    public void receiveNotification(String notification) {
        notifications.add(notification);
    }

    public void clearNotifications() {
        notifications.clear();
    }

    @Override
    public String toString() {
        return String.format("Клиент: %s, уведомления: (%s)", name, String.join("; ", notifications));
    }
}
