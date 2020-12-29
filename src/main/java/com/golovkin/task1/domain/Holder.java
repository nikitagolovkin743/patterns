package com.golovkin.task1.domain;

public class Holder {
    private String firstName;
    private String lastName;

    public Holder(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return String.format("%s %s", firstName, lastName);
    }
}
