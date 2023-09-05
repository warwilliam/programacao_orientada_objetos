package org.example;

import java.util.List;

public class Store {

    protected List<Product> products;



    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public double calcTotalArea(List<Product> products){
       double total =0;
       for(Product product: products){
            total += product.calcSpace();
        }
       return total;
    }

}
