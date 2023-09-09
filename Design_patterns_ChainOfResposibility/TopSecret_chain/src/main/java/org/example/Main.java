package org.example;

import org.example.model.*;

public class Main {
    public static void main(String[] args) {
        HandlerDocument handlerDocument = new Congress().setNextHandler(new Minister().setNextHandler(new President()));

        Document document = new Document("Decisão comum", 1);
        Document document1 = new Document("Assunto sigiloso", 2);
        Document document2 = new Document("Top secret", 3);

        handlerDocument.processSecret(document);
        handlerDocument.processSecret(document1);
        handlerDocument.processSecret(document2);

    }
}