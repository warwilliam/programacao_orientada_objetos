package org.example;

import org.example.model.Product;
import org.example.service.CentralCheck;

public class LineProduction {
    public static void main(String[] args) {

        CentralCheck centralCheck = new CentralCheck();

        Product product = new Product(1000,1200,"saudavel");
        Product product1 = new Product(100,1300,"saudavel");
        Product product2 = new Product(1100,1200,"amassado");
        Product product3 = new Product(1000,200,"quase saudavel");

        centralCheck.check(product);
        centralCheck.check(product1);
        centralCheck.check(product2);
        centralCheck.check(product3);

    }
}