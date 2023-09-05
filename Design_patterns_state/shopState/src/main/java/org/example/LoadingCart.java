package org.example;

import java.util.ArrayList;
import java.util.List;

public class LoadingCart implements StateCart {

    private Cart c;

    List<Product> products = new ArrayList<>();
    public LoadingCart(Cart c) {
        this.c = c;
    }

    @Override
    public void addProduct(Product product) {
        products.add(product);

        System.out.println(product+ "foi adicionado ao cart");
    }

    @Override
    public void cancelCart() {
            products.removeAll(products);
            c.setState(new EmptyCart(c));
    }

    @Override
    public void returnProduct() {
        if(c.getProducts().size()> 0){
            Product p = c.getProducts().get(c.getProducts().size() -1);
            System.out.println(p.getDescription());
        } else System.out.println("não ha produtos para retirar");
    }

    @Override
    public void nextState() {
        c.setState(new PayingCart(c));
        System.out.println("indo para pagamento");
    }
}
