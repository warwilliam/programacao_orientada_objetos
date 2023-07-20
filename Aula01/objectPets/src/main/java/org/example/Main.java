package org.example;

import org.example.model.Animal;

public class Main {
    public static void main(String[] args) {


        Animal ani1 = new Animal("dog", "Shesheu", 1, "500 gramas", "Au au");
        Animal ani2 = new Animal("fish", "Nemo", 0, "5 gramas", "plub plub");
        Animal ani3 = new Animal("cat", "Snow", 3, "300 gramas", "miau miau");

        System.out.println("O primeiro animal e do tipo: " + ani1.getType() + " e seu nome e: " + ani1.getName() + " ele como a quantia de: " + ani1.getFoodDay() + " e faz: " + ani1.getNoise());
        System.out.println("O primeiro animal e do tipo: " + ani2.getType() + " e seu nome e: " + ani2.getName() + " ele como a quantia de: " + ani2.getFoodDay() + " e faz: " + ani2.getNoise());
        System.out.println("O primeiro animal e do tipo: " + ani3.getType() + " e seu nome e: " + ani3.getName() + " ele como a quantia de: " + ani3.getFoodDay() + " e faz: " + ani3.getNoise());

    }

}