package org.example.model;

public class Address {

    private Integer id;
    private String street;
    private String Number;
    private String city;
    private String neghborhood;

    public Address() {
    }

    public Address(Integer id, String street, String number, String city, String neghborhood) {
        this.id = id;
        this.street = street;
        Number = number;
        this.city = city;
        this.neghborhood = neghborhood;
    }

    public Address(String street, String number, String city, String neghborhood) {
        this.street = street;
        Number = number;
        this.city = city;
        this.neghborhood = neghborhood;
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

    public String getNeghborhood() {
        return neghborhood;
    }

    public void setNeghborhood(String neghborhood) {
        this.neghborhood = neghborhood;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", street='" + street + '\'' +
                ", Number='" + Number + '\'' +
                ", city='" + city + '\'' +
                ", neghborhood='" + neghborhood + '\'' +
                '}';
    }
}
