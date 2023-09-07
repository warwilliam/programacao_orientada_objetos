package org.example;

public abstract class Menu {

    private double basePrice;

    public Menu(double basePrice) {
        this.basePrice = basePrice;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public abstract void assempleMenu();

    public abstract void calcSellPrice();



}
