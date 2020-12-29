package com.golovkin.task3;

import com.golovkin.task3.domain.Client;

public interface SendNotificationCommand {
    void send(Client client);
}
