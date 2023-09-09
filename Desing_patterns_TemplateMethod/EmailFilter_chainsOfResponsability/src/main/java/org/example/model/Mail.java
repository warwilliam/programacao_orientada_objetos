package org.example.model;

public class Mail {

    private String origin;
    private String destiny;
    private String subject;

    public Mail(String origin, String destiny, String subject) {
        this.origin = origin;
        this.destiny = destiny;
        this.subject = subject;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestiny() {
        return destiny;
    }

    public void setDestiny(String destiny) {
        this.destiny = destiny;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
