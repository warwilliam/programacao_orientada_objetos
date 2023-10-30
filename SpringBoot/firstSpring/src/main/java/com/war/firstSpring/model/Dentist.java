package com.war.firstSpring.model;

public class Dentist {

    private Integer id;
    private String name;
    private String lastName;
    private Integer registration;

    private Integer isAgreement;

    public Dentist() {
    }

    public Dentist(Integer id, String name, String lastName, Integer registration, Integer isAgreement) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.registration = registration;
        this.isAgreement = isAgreement;
    }

    public Dentist(String name, String lastName, Integer registration, Integer isAgreement) {
        this.name = name;
        this.lastName = lastName;
        this.registration = registration;
        this.isAgreement = isAgreement;
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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getRegistration() {
        return registration;
    }

    public void setRegistration(Integer registration) {
        this.registration = registration;
    }

    public Integer getIsAgreement() {
        return isAgreement;
    }

    public void setIsAgreement(Integer isAgreement) {
        this.isAgreement = isAgreement;
    }

    @Override
    public String toString() {
        return "Dentist{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", registration=" + registration +
                ", isAgreement=" + isAgreement +
                '}';
    }
}
