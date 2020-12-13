package com.example.demo.model;

public class Client {
    private String name;
    private String lastname;
    private String email;
    private Card card;

    public Client(String name, String lastname, String email, Card card) {
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.card = card;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }
}

