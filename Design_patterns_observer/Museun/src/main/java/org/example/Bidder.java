package org.example;

public class Bidder {



    private String name;
    private double bid;

    public Bidder(String name, double bid) {
        this.name = name;
        this.bid = bid;
    }

    public String getName() {
        return name;
    }

    public void takeBid(double price, double bid){
        if (price <= this.bid && price <bid){
            System.out.println("Foi dado o lance no valor de: R$"+bid+" pelo senhor "+name);
        } else {
            System.out.println("Não possui carteira para dar o lance");
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBid() {
        return bid;
    }

    public void setBid(double bid) {
        this.bid = bid;
    }
}
