package org.example.model;

public class President extends HandlerDocument {
    @Override
    public void processSecret(Document document) {
        System.out.println("Como president posso checar todos os top secrets");
        if (this.handlerDocument != null){
            this.handlerDocument.processSecret(document);
        }
    }
}
