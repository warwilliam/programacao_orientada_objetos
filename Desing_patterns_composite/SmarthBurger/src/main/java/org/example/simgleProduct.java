package org.example;

public class simgleProduct implements Product {

    private String name;
    private double price;



    public simgleProduct(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

}
