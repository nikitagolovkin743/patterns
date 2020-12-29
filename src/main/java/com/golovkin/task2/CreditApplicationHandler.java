package com.golovkin.task2;

import com.golovkin.task2.domain.CreditApplication;

public interface CreditApplicationHandler {
    boolean handle(CreditApplication creditApplication);

    void setNext(CreditApplicationHandler next);
}
