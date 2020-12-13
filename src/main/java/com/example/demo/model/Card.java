package com.example.demo.model;

public class Card {
    private String cardNumber;
    private String ccv;
    private String owner;
    private String month;
    private String year;
    private String company;

    public Card(String cardNumber, String ccv, String owner, String month, String year, String company) {
        this.cardNumber = cardNumber;
        this.ccv = ccv;
        this.owner = owner;
        this.month = month;
        this.year = year;
        this.company = company;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCcv() {
        return ccv;
    }

    public void setCcv(String ccv) {
        this.ccv = ccv;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
