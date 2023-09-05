package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ProductFactory productFactory = new ProductFactory();

        Product p1 = productFactory.makeProduct("ball");
        System.out.println(p1.calcSpace());

        Product p2 = productFactory.makeProduct("box");
        System.out.println(p2.calcSpace());

        List<Product> products1 = new ArrayList<>();
        products1.add(p1);
        products1.add(p2);
        System.out.println(products1);
        Store store = new Store();
        store.setProducts(products1);
        System.out.println(store.calcTotalArea(store.products));

    }
}