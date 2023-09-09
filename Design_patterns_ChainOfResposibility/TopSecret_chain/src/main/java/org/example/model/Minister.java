package org.example.model;

public class Minister extends HandlerDocument {
    @Override
    public void processSecret(Document document) {
        if (document.getLevel() <= 2) {
            System.out.println("Documento acessivel , ministro acusa ciencia e encaminha para próximas instâcias");
            this.handlerDocument.processSecret(document);
        } else if (this.handlerDocument != null) {
            System.out.println("não posso ter acesso ao documento, encaminhando para as instancias superiores");
            this.handlerDocument.processSecret(document);
        }
    }
}