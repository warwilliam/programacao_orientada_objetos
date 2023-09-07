package org.example;

public class Permanet extends Employee {

    private double baseSalary;
    private double disccounts;
    private double bonus;

    public Permanet(String name, String lastName, String account, double baseSalary, double disccounts, double bonus) {
        super(name, lastName, account);
        this.baseSalary = baseSalary;
        this.disccounts = disccounts;
        this.bonus = bonus;
    }

    @Override
    public double calcSalary() {
        return baseSalary + bonus - disccounts;
    }

    @Override
    public void printreceipt(double amount) {
        System.out.println("Recibo de funcionario efetivo na quantia de: R$ "+amount);
    }

    @Override
    public void deposit(double amount) {
        System.out.println("Deposito para funcionario efetivo realizado na quantia de: R$ "+amount);
    }
}
