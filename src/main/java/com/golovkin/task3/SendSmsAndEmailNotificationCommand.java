package com.golovkin.task3;

import com.golovkin.task3.domain.Client;
import com.golovkin.task3.util.SendSmsNotificationCommandFactory;

public class SendSmsAndEmailNotificationCommand implements SendNotificationCommand {
    private String creditApplicationUrl;
    private String creditApplicationContent;

    public SendSmsAndEmailNotificationCommand(String creditApplicationUrl, String creditApplicationContent) {
        this.creditApplicationUrl = creditApplicationUrl;
        this.creditApplicationContent = creditApplicationContent;
    }

    @Override
    public void send(Client client) {
        SendNotificationCommand sendEmailNotificationCommand = new SendEmailNotificationCommand(creditApplicationContent);
        SendNotificationCommand sendSmsNotificationCommand = SendSmsNotificationCommandFactory.createSendSmsNotificationCommandWithUrl(creditApplicationUrl);

        sendEmailNotificationCommand.send(client);
        sendSmsNotificationCommand.send(client);
    }
}
