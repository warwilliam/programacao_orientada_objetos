package org.example.model;

public abstract class HandlerDocument {


    protected HandlerDocument handlerDocument;

    public abstract void processSecret(Document document);

    public HandlerDocument setNextHandler(HandlerDocument nextHandler){
        this.handlerDocument = nextHandler;
        return this;
    }


}
