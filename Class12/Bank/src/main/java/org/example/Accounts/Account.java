package org.example.Accounts;

import org.example.Register.Client;

public abstract class Account extends Client {

    protected int number;
    protected double amount;

    protected AccountType type;

    protected void printCupom(){
        System.out.println("Operacao realizada");
    }
    public  abstract void draw(double amount);

    public void deposit(){}

    protected abstract boolean checkAmount();

    public boolean checkClient(){return false;}


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public AccountType getType() {
        return type;
    }

    public void setType(AccountType type) {
        this.type = type;
    }
}
