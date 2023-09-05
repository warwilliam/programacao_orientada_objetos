package org.example;

public class Thirst implements  StateTamgochi{

     private Tamagochi t;

    public Thirst(Tamagochi t) {
        this.t = t;
    }

    @Override
    public void eat() {
        System.out.println("se negou a comer");
    }

    @Override
    public void drink() {
        t.setState(new Happy(t));
        System.out.println("Hidratado e esta feliz");
    }

    @Override
    public void kindness() {
        System.out.println("faz cara de desidratado");
    }
}
