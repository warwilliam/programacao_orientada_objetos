package org.example.service.impl;

import org.example.model.Product;
import org.example.service.ControlBegin;

public class CheckWeight extends ControlBegin {
    @Override
    public void check(Product product) {
        if (product.getWeight() >= 1200 && product.getWeight() <= 1300){
            product.setScoreQuality(product.getScoreQuality()+1);
            System.out.println("Passou no controle de peso, encaminhado para o proximo controle");
            nextStep.check(product);
        } else {
            System.out.println("não passou no controle de peso");
            nextStep.check(product);
        }
    }
}
