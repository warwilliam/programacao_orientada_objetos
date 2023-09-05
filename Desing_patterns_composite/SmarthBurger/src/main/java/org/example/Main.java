package org.example;

public class Main {
    public static void main(String[] args) {
        Product xtudo = new simgleProduct("Xtudo",15.90);
        Product refri = new simgleProduct("Coca cola",5.90);
        Product fries = new simgleProduct("Fritas", 9.50);

        Cart ped1 = new Cart();
        ped1.addProduct(xtudo);
        ped1.addProduct(fries);

        Cart ped2 = new Cart();
        ped2.addProduct(refri);
        ped2.addProduct(fries);

        Cart ped3 = new Cart();
        ped3.addProduct(xtudo);
        ped3.addProduct(refri);

        compositeProduct combo1 =  new compositeProduct();
        combo1.makeCombo(xtudo);
        combo1.makeCombo(refri);
        combo1.makeCombo(fries);

        Cart ped4 = new Cart();
        ped4.addProduct(combo1);

        ped3.printCart();
        ped2.printCart();
        ped1.printCart();
        ped4.printCart();
    }
}