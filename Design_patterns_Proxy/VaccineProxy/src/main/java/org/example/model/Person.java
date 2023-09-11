package org.example.model;

import java.util.Date;

public class Person {

    private String name;
    private String lasName;
    private String cpf;
    private Date dateVaccine;
    private String vaccineName;

    public Person(String name, String lasName, String cpf, Date dateVaccine, String vaccineName) {
        this.name = name;
        this.lasName = lasName;
        this.cpf = cpf;
        this.dateVaccine = dateVaccine;
        this.vaccineName = vaccineName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLasName() {
        return lasName;
    }

    public void setLasName(String lasName) {
        this.lasName = lasName;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDateVaccine() {
        return dateVaccine;
    }

    public void setDateVaccine(Date dateVaccine) {
        this.dateVaccine = dateVaccine;
    }

    public String getVaccineName() {
        return vaccineName;
    }

    public void setVaccineName(String vaccineName) {
        this.vaccineName = vaccineName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lasName='" + lasName + '\'' +
                ", cpf='" + cpf + '\'' +
                ", dateVaccine=" + dateVaccine +
                ", vaccineName='" + vaccineName + '\'' +
                '}';
    }
}
