package org.example;

public class Happy implements  StateTamgochi{

    private Tamagochi t;

    public Happy(Tamagochi t) {
        this.t = t;
    }


    @Override
    public void eat() {
        System.out.println("Sem alteração");
    }

    @Override
    public void drink() {
        System.out.println("bip bip bip bip bip");
    }

    @Override
    public void kindness() {
        System.out.println("Continua feliz");
    }
}
