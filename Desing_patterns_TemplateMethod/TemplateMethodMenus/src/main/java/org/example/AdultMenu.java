package org.example;

public class AdultMenu extends Menu {


    public AdultMenu(double basePrice) {
        super(basePrice);
    }



    @Override
    public void assempleMenu() {
        System.out.println("Menu adulto, apenas montar o prato do dia");
    }

    @Override
    public void calcSellPrice() {
        System.out.println("O total deste pedido menu adulto é: R$"+getBasePrice());
    }
}
