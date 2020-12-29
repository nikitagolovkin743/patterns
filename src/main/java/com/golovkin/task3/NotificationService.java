package com.golovkin.task3;

import com.golovkin.task3.domain.Client;
import com.golovkin.task3.util.SendSmsNotificationCommandFactory;

public class NotificationService {
    private NotificationService() {
    }

    public static void sendNotificationBySms(Client client, String creditApplicationUrl) {
        SendNotificationCommand sendSmsNotificationCommand = SendSmsNotificationCommandFactory.createSendSmsNotificationCommandWithUrl(creditApplicationUrl);

        sendSmsNotificationCommand.send(client);
    }

    public static void sendNotificationByEmail(Client client, String creditApplicationContent) {
        SendNotificationCommand sendEmailNotificationCommand = new SendEmailNotificationCommand(creditApplicationContent);

        sendEmailNotificationCommand.send(client);
    }

    public static void sendNotificationBySmsAndEmail(Client client, String creditApplicationUrl, String creditApplicationContent) {
        SendNotificationCommand sendSmsAndEmailNotificationCommand = new SendSmsAndEmailNotificationCommand(creditApplicationUrl, creditApplicationContent);

        sendSmsAndEmailNotificationCommand.send(client);
    }
}
