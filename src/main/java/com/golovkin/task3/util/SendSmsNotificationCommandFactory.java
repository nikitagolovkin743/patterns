package com.golovkin.task3.util;

import com.golovkin.task3.SendSmsNotificationCommand;

public class SendSmsNotificationCommandFactory {
    public static SendSmsNotificationCommand createSendSmsNotificationCommandWithUrl(String url) {
        String notificationContent = String.format("ссылка на анкету %s", url);

        return new SendSmsNotificationCommand(notificationContent);
    }
}
