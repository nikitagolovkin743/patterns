package com.golovkin.task2.domain;

import java.math.BigDecimal;
import java.util.List;

public class CreditApplication {
    private String firstName;
    private String middleName;
    private String lastName;
    private Boolean isMarried;

    private String address;
    private String phoneNumber;
    private String passportNumber;

    private BigDecimal monthlyIncome;

    private BigDecimal creditPercent;
    private BigDecimal amount;
    private BigDecimal monthlyPayment;
    private Integer years;

    private EducationType educationType;
    private String currentJob;

    private List<Credit> previousCredits;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Boolean isMarried() {
        return isMarried;
    }

    public void setMarried(boolean married) {
        isMarried = married;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public BigDecimal getMonthlyIncome() {
        return monthlyIncome;
    }

    public void setMonthlyIncome(BigDecimal monthlyIncome) {
        this.monthlyIncome = monthlyIncome;
    }

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

    public EducationType getEducationType() {
        return educationType;
    }

    public void setEducationType(EducationType educationType) {
        this.educationType = educationType;
    }

    public String getCurrentJob() {
        return currentJob;
    }

    public void setCurrentJob(String currentJob) {
        this.currentJob = currentJob;
    }

    public List<Credit> getPreviousCredits() {
        return previousCredits;
    }

    public void setPreviousCredits(List<Credit> previousCredits) {
        this.previousCredits = previousCredits;
    }
}
