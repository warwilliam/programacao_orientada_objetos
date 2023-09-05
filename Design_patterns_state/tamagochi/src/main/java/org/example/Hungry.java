package org.example;

public class Hungry implements  StateTamgochi{

    private Tamagochi t;

    public Hungry(Tamagochi t) {
        this.t = t;
    }

    @Override
    public void eat() {
        t.setState(new Happy(t));
        System.out.println("Fui alimentado e estou feliz ");
    }

    @Override
    public void drink() {
        t.setState(new Happy(t));
        System.out.println("Fui hidratado e estou feliz");
    }

    @Override
    public void kindness() {
        System.out.println("Nada aconteceu");
    }
}
