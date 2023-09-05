package org.example;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product){
        products.add(product);
    }

    public void printCart(){
        for(Product product : products){
            System.out.println(product.getName()+ " R$ "+ product.getPrice());
        }
    }

}
