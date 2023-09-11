package org.example.service;

import org.example.model.Document;

public class AccessProxy implements Access{



    @Override
    public void accessContent(String email, String url, Document document) {
        if (document.searchAccount(email) && document.getUrl().equalsIgnoreCase(url)){
            AccessService accessService = new AccessService();
            accessService.accessContent(email, url, document);
            System.out.println("acesso liberado");
        } else {
            System.out.println("Não possiu permissão para acessar essa url");
        }
    }
}
