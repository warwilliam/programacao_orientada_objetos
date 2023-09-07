package org.example;

public abstract class Employee {

    private String name;
    private String lastName;
    private String account;

    public Employee(String name, String lastName, String account) {
        this.name = name;
        this.lastName = lastName;
        this.account = account;
    }

    public void payDay(){
        double amount;
        amount = calcSalary();
        printreceipt(amount);
        deposit(amount);
    }

    public abstract double calcSalary();

    public abstract void printreceipt(double amount);

    public abstract void deposit(double amount);
}
