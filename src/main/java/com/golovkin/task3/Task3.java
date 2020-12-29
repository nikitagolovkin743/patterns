package com.golovkin.task3;

import com.golovkin.task3.domain.Client;

public class Task3 {
    private static Client client;

    public static void main(String[] args) {
        client = new Client("Ivan Ivanov");

        Runnable sendNotificationBySms = () -> NotificationService.sendNotificationBySms(client, "http://google.ru");
        Runnable sendNotificationByEmail = () -> NotificationService.sendNotificationByEmail(client, "*анкета*");
        Runnable sendNotificationBySmsAndEmail = () -> NotificationService.sendNotificationBySmsAndEmail(client, "*анкета*", "http://google.ru");

        demonstrateNotificationType("sms", sendNotificationBySms);
        demonstrateNotificationType("email", sendNotificationByEmail);
        demonstrateNotificationType("sms и email", sendNotificationBySmsAndEmail);
    }

    public static void demonstrateNotificationType(String notificationType, Runnable notificationServiceMethod) {
        System.out.printf("Уведомления по %s:\n", notificationType);
        notificationServiceMethod.run();
        System.out.println(client);
        System.out.println("----");
        client.clearNotifications();
    }
}
