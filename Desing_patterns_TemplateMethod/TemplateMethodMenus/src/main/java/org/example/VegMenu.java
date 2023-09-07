package org.example;

public class VegMenu extends Menu{

    private double packingPrice = getBasePrice()/10;

    public VegMenu(double basePrice) {
        super(basePrice);
    }

    @Override
    public void assempleMenu() {
        System.out.println("Menu veg, montar com a embalagem especial e temperos");
    }

    @Override
    public void calcSellPrice() {
        System.out.println("O total do pedido Veg é R$"+(getBasePrice()+packingPrice));
    }
}
