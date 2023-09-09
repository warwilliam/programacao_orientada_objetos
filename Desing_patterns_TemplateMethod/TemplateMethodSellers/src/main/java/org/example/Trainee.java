package org.example;

public class Trainee extends Seller{
    public Trainee(String name, int sales) {
        super(name, sales);
        super.pointsOfSell = 5;
    }

    @Override
    public int calcPoints() {
        return sales*pointsOfSell;
    }

    @Override
    public String showRank(){
        String rank = "";
        if (calcPoints() <= 50)
            rank = "Estagiário novato";
        else {
            rank = "Estagiário experiente";
        }
        return rank;
    }

}
