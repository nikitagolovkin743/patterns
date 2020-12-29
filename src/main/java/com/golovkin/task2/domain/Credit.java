package com.golovkin.task2.domain;

import java.math.BigDecimal;

public class Credit {
    private BigDecimal creditPercent;
    private BigDecimal amount;
    private BigDecimal monthlyPayment;
    private Integer years;
    private boolean isPaid;

    public BigDecimal getCreditPercent() {
        return creditPercent;
    }

    public void setCreditPercent(BigDecimal creditPercent) {
        this.creditPercent = creditPercent;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getMonthlyPayment() {
        return monthlyPayment;
    }

    public void setMonthlyPayment(BigDecimal monthlyPayment) {
        this.monthlyPayment = monthlyPayment;
    }

    public Integer getYears() {
        return years;
    }

    public void setYears(Integer years) {
        this.years = years;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public void setPaid(boolean paid) {
        isPaid = paid;
    }
}
