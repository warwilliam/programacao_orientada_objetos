package org.example.model;

public class Hotel {

    private Integer id;
    private String name;
    private String street;
    private String number;
    private String city;
    private String state;
    private boolean is5stars;

    public Hotel() {
    }

    public Hotel(Integer id, String name, String street, String number, String city, String state, boolean is5stars) {
        this.id = id;
        this.name = name;
        this.street = street;
        this.number = number;
        this.city = city;
        this.state = state;
        this.is5stars = is5stars;

    }

    public Hotel(String name, String street, String number, String city, String state, boolean is5stars) {
        this.name = name;
        this.street = street;
        this.number = number;
        this.city = city;
        this.state = state;
        this.is5stars = is5stars;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public boolean isIs5stars() {
        return is5stars;
    }

    public void setIs5stars(boolean is5stars) {
        this.is5stars = is5stars;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", street='" + street + '\'' +
                ", number='" + number + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", is5stars=" + is5stars +
                '}';
    }
}
