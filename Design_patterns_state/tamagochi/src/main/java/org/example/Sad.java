package org.example;

public class Sad implements  StateTamgochi{

    private Tamagochi t;

    public Sad(Tamagochi t) {
        this.t = t;
    }

    @Override
    public void eat() {
        System.out.println("faz 2 bipes e o display mostra o bichinho vomitando");
    }

    @Override
    public void drink() {
        System.out.println("o dispositivo emite 3 bips e o display pisca");
    }

    @Override
    public void kindness() {
        t.setState(new Happy(t));
        System.out.println("Agora esta feliz");
    }
}
