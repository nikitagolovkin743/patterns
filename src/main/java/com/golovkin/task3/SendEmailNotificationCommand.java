package com.golovkin.task3;

import com.golovkin.task3.domain.Client;

public class SendEmailNotificationCommand implements SendNotificationCommand {
    private String notificationContent;

    public SendEmailNotificationCommand(String notificationContent) {
        this.notificationContent = notificationContent;
    }

    @Override
    public void send(Client client) {
        String emailNotification = String.format("Email - %s", notificationContent);
        SendNotificationCommand sendSmsNotificationCommand = new SendSmsNotificationCommand("Вам пришла анкета, проверьте email");

        client.receiveNotification(emailNotification);

        sendSmsNotificationCommand.send(client);
    }
}
