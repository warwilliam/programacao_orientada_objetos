package org.example.service;

import org.example.model.Document;

public class AccessService implements Access {
    @Override
    public void accessContent(String email, String url, Document document) {

        System.out.println("Acesso libera ao usuario: "+email+" ao conteúdo contido em: "+url);

    }
}
