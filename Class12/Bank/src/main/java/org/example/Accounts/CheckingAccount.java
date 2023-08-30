package org.example.Accounts;

public class CheckingAccount extends Account {

    private double amount;

    protected double limitSpecial;

    protected int AccountClass;


    @Override
    public void draw(double drawAmount) {

        if (amount + limitSpecial < drawAmount){
            System.out.println("saldo insuficiente");
        } else {
        amount = amount - drawAmount;}
        printCupom();
    }

    @Override
    protected boolean checkAmount() {
        return false;
    }


}
