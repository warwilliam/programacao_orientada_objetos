package org.example;

public class Interface {
    public static void main(String[] args)
    {
        Tamagochi tamagochi = new Tamagochi();
        tamagochi.setState(new Hungry(tamagochi));
        tamagochi.eat();
        tamagochi.setState(new Thirst(tamagochi));
        tamagochi.drink();
        tamagochi.kindness();

    }
}