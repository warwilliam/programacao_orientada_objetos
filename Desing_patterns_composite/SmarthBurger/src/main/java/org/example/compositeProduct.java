package org.example;

import java.util.ArrayList;
import java.util.List;

public class compositeProduct implements Product{

    private List<Product> products = new ArrayList<>();

    public void makeCombo(Product product){
        products.add(product);

    }


    public List<Product> getProducts() {
        return products;
    }


    @Override
    public String getName() {
        String itens = "";
        for (Product product :products){
            itens = itens + product.getName()+ " - " ;
        }
        return itens;
    }

    @Override
    public double getPrice() {
        double total = 0.0;
        for(Product product :products){
            total += product.getPrice()*0.9;
        }
        return total;
    }
}
