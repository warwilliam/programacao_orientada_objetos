package org.example.model;

import java.io.Serializable;

public class Dog implements Serializable {

    private String name;
    private String race;
    private Integer age;
    private String address;


    public Dog(String name, String race, Integer age, String address) {
        this.name = name;
        this.race = race;
        this.age = age;
        this.address = address;
    }

    public Dog() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
