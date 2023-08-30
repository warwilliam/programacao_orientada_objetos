package org.example;

public class Main {
    public static void main(String[] args) {


        Dog do1 = new Dog("Yorkshire",2020,5001,true,false);
        do1.setName("Cherie");
        do1.CheckAge(do1.getBirthYear());
        do1.ableCheck(do1.isHealthy(), do1.getWeightGrams());

        System.out.println("the dog has a name now: "+do1.getName()+", your weight is : "+do1.getWeightGrams()+" grams"+
                " and your adopt status is: "+do1.isAble());

        }

    }
