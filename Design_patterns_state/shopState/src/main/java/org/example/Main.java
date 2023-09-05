package org.example;

public class Main {
    public static void main(String[] args) {
        Cart cart = new Cart();
        cart.getState();
        cart.addProduct(new Product("Monitor de 32 polegas",1000.0));
        cart.getState();
        cart.getState().returnProduct();
        cart.getState();
        cart.addProduct(new Product("Monitor de 32 polegas",1000.0));
        cart.getState().nextState();
        cart.addProduct(new Product("Monitor de 32 polegas",1000.0));
        cart.getState().nextState();
        cart.getState();
        cart.getState().nextState();
    }
}