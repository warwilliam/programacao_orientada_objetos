package com.example.Trainer.model;

public class User {

    private String name;
    private String Lastname;

    public User(String name, String lastname) {
        this.name = name;
        Lastname = lastname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }
}
