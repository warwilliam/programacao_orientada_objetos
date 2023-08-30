package org.example.Accounts;

public class SavingAccount extends Account {


    @Override
    public void draw(double drawAmount) {
        if (amount  < drawAmount){
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
