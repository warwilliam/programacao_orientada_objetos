package org.example;

import java.util.ArrayList;
import java.util.List;

public class EmptyCart implements StateCart{

    private Cart c;

    List<Product> products = new ArrayList<>();
    public EmptyCart(Cart c) {
        this.c = c;
    }

    @Override
    public void addProduct(Product product) {
        products.add(product);
        c.setState(new LoadingCart(c));
        System.out.println(product+ "foi adicionado ao cart");
    }

    @Override
    public void cancelCart() {
        c.setState(new EmptyCart(c));
        System.out.println("O cart foi excluido");
    }

    @Override
    public void returnProduct() {
        System.out.println("Error! o cart ja esta vazio");
    }

    @Override
    public void nextState() {
        c.setState(new LoadingCart(c));
        System.out.println("Cart iniciado com produtos add");

    }
}
