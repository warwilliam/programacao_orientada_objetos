package org.example;

public class PayingCart implements StateCart{

    private Cart c;

    public PayingCart(Cart c) {
        this.c = c;
    }

    @Override
    public void addProduct(Product product) {
        System.out.println("Checkout, não é possivel add produto agora, para tal retornar para o carrinho");
    }

    @Override
    public void cancelCart() {
      c.isEmpty();
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
            c.setState(new ClosedCart(c));
        System.out.println("Pagamento finalizado, fechando pedido");
    }
}
