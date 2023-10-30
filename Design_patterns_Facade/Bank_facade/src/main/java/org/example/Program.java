package org.example;

import org.example.models.Card;
import org.example.models.Product;
import org.example.service.impl.FacadeDisccount;

public class Program {
    public static void main(String[] args) {

        FacadeDisccount facadeDisccount = new FacadeDisccount();
        Card card = new Card("7544-7554-1900-1966", "star bank");
        Product product = new Product("Chocolat","Bar");
        System.out.println("Desconto aplicado: "+ facadeDisccount.disccount(card,product,6)+"%");

        Card card1 = new Card("7544-7554-1900-1966", "star bank");
        Product product1 = new Product("energetico Red monster","Lata");
        System.out.println("Desconto aplicado: "+ facadeDisccount.disccount(card1,product1,13)+"%");
    }
}