package org.example.service.impl;

import org.example.model.Product;
import org.example.service.ControlBegin;

public class CheckPack extends ControlBegin {
    @Override
    public void check(Product product) {
        if (product.getPack().equalsIgnoreCase("saudavel") || product.getPack().equalsIgnoreCase("quase saudavel")){
            product.setScoreQuality(product.getScoreQuality()+1);
            System.out.println("Embalagem ok");
            checkScore(product);
        } else{
            System.out.println("Não passou no teste de embalagem");
            checkScore(product);
        }
    }

    public void checkScore(Product product){
        if(product.getScoreQuality() >= 3){
            System.out.println("Produto aprovado totalmente");
        } else if (product.getScoreQuality() == 2 ) {
            System.out.println("Produto aprovado parcialmente");
        } else {
            System.out.println("Produto reprovado");
        }
    }
}
