package com.war.firstSpring.model;

public class Address {

    private Integer id;
    private String street;
    private String Number;
    private String city;
    private String neighborhood;

    private String state;

    public Address() {
    }

    public Address(Integer id, String street, String number, String city, String neighborhood, String state) {
        this.id = id;
        this.street = street;
        Number = number;
        this.city = city;
        this.neighborhood = neighborhood;
        this.state = state;
    }

    public Address(String street, String number, String city, String neighborhood, String state) {
        this.street = street;
        Number = number;
        this.city = city;
        this.neighborhood = neighborhood;
        this.state = state;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumber() {
        return Number;
    }

    public void setNumber(String number) {
        Number = number;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", street='" + street + '\'' +
                ", Number='" + Number + '\'' +
                ", city='" + city + '\'' +
                ", neighborhood='" + neighborhood + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
