package org.example.service.impl;

import org.example.model.Product;
import org.example.service.ControlBegin;

public class CheckBatch extends ControlBegin {
    @Override
    public void check(Product product) {
        if (product.getBatch() >= 1000 && product.getBatch() <= 2000){
            product.setScoreQuality(product.getScoreQuality()+1);
            System.out.println("Lote ok, seguindo para o proximo controle");
            this.nextStep.check(product);

        } else {
            System.out.println("Lote fora dos padrões");
            this.nextStep.check(product);
        }
    }
}
