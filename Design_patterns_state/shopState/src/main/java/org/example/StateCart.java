package org.example;

public interface  StateCart {

    public void addProduct(Product product);
    public void cancelCart();
    public void returnProduct();
    public void nextState();

}
