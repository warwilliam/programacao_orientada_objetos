package org.example;

public class ProductFactory {

    public Product makeProduct(String type) {
        Product product = null;

        if (type.equals("box")){
            return new Box();
        } else if (type.equals("ball")) {
            return new Ball();
        }
        else return null;
    }
}
