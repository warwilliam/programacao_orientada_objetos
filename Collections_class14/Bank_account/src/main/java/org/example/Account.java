package org.example;

public class Account implements Comparable {

    protected  int NumAccount;
    protected double amount;

    public int getNumAccount() {
        return NumAccount;
    }

    public void setNumAccount(int numAccount) {
        NumAccount = numAccount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Account(int numAccount, double amount) {
        NumAccount = numAccount;
        this.amount = amount;
    }

    @Override
    public int compareTo() {
        return Comparable.super.compareTo();
    }
}
