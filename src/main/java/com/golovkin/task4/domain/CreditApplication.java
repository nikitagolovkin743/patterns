package com.golovkin.task4.domain;

import java.math.BigDecimal;

public class CreditApplication {
    private static int creditApplicationCounter;

    private int id;

    private String firstName;
    private String lastName;

    private BigDecimal balance;

    public CreditApplication() {
        creditApplicationCounter++;
        id = creditApplicationCounter;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return String.format("id: %d, ФИ: %s %s, баланс: %s", id, lastName, firstName, balance);
    }
}
