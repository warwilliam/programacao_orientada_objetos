package org.example;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private StateCart state;

    List<Product> products = new ArrayList<>();

    public Cart() {
        this.setState(new EmptyCart(this));

    }

    public StateCart getState() {
        return state;
    }

    public void setState(StateCart state) {
        this.state = state;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public void addProduct(Product product){
        products.add(product);
    }

    public boolean isEmpty(){
        return products.size() ==0;
    }


}
