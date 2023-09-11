package org.example.service;

import org.example.model.Document;

public interface Access {

    public void accessContent(String email, String url, Document document);

}
