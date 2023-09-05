package org.example;

public class ClosedCart  implements StateCart{

    private Cart c;

    public ClosedCart(Cart c) {
        this.c = c;
    }

    @Override
    public void addProduct(Product product) {
        System.out.println("Pedido fechado, nãoé possivel add novos produtos");
    }

    @Override
    public void cancelCart() {
        System.out.println("Pedido fechado, para cancelamento apos fechmento, entrar em contato com o SAC");
    }

    @Override
    public void returnProduct() {
        System.out.println("Pedido fechado, não e possivel retornar");
    }

    @Override
    public void nextState() {
        c.setState(new EmptyCart(c));
        System.out.println("Abrindo um novo cart");
    }
}
