package org.example;

public class FreeLancer extends Employee{

    private double priceHour;
    private int hours;

    public FreeLancer(String name, String lastName, String account, double priceHour, int hours) {
        super(name, lastName, account);
        this.priceHour = priceHour;
        this.hours = hours;
    }

    @Override
    public double calcSalary() {
        return priceHour * hours ;
    }

    @Override
    public void printreceipt(double amount) {
        System.out.println("Pagamento para funcionario free lancer no valor de R$"+amount);
    }

    @Override
    public void deposit(double amount) {
        System.out.println("Deposito para funcionario free lancer no valor de R$"+amount);
    }
}
