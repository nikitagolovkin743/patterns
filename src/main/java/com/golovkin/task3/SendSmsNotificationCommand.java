package com.golovkin.task3;

import com.golovkin.task3.domain.Client;

public class SendSmsNotificationCommand implements SendNotificationCommand {
    private String notificationContent;

    public SendSmsNotificationCommand(String notificationContent) {
        this.notificationContent = notificationContent;
    }

    @Override
    public void send(Client client) {
        String notification = String.format("SMS - %s", notificationContent);

        client.receiveNotification(notification);
    }
}
