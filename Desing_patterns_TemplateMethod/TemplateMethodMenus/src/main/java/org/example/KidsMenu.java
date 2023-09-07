package org.example;

public class KidsMenu extends Menu {

    private double giftprice;

    public KidsMenu(double basePrice, double giftprice) {
        super(basePrice);
        this.giftprice = giftprice;
    }


    @Override
    public void assempleMenu() {
        System.out.println("Menu kids, incluir o a surpresa!");
    }

    @Override
    public void calcSellPrice() {

        System.out.println("O preco total do menu kids é R$"+(giftprice+getBasePrice()));
    }
}
