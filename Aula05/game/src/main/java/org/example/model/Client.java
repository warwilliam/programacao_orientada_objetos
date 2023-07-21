package org.example.model;

public class Client {

    private int number;
    private String name;
    private double debt;

    public Client(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public void increaseDebt(int valor){
        this.debt += valor;
    }

    public void payDebt(double valor){
        this.debt -= valor;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDebt() {
        return debt;
    }

    public void setDebt(double debt) {
        this.debt = debt;
    }
}
