package com.war.firstSpring.model;

import java.util.Date;

public class Patient {

    private Integer id;
    private String name;
    private String last_name;
    private String cpf;
    private Date date_reg;
    private Address address;

    public Patient() {
    }

    public Patient(Integer id, String name, String last_name, String cpf, Address address) {
        this.id = id;
        this.name = name;
        this.last_name = last_name;
        this.cpf = cpf;
        this.address = address;
    }

    public Patient(Integer id, String name, String lastname, String cpf, Date dateReg, Address address) {
        this.id = id;
        this.name = name;
        this.last_name = lastname;
        this.cpf = cpf;
        this.date_reg = dateReg;
        this.address = address;
    }

    public Patient(String name, String lastname, String cpf, Date dateReg, Address address) {
        this.name = name;
        this.last_name = lastname;
        this.cpf = cpf;
        this.date_reg = dateReg;
        this.address = address;
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

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDate_reg() {
        return date_reg;
    }

    public void setDate_reg(Date date_reg) {
        this.date_reg = date_reg;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastname='" + last_name + '\'' +
                ", cpf='" + cpf + '\'' +
                ", dateReg=" + date_reg +
                ", address=" + address +
                '}';
    }
}
