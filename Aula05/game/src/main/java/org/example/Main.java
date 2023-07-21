package org.example;

import org.example.model.Client;
import org.example.model.Player;
import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {

        Client c1 = new Client(01,"Zé");
        Client c2 = new Client(02,"João");

        c1.increaseDebt(500);
        c1.payDebt(300);

        System.out.println("The client: "+c1.getName()+" have a debt of: "+c1.getDebt());

        Player p1 = new Player("William","warwilliam");
        Player p2 = new Player("Natalia","natM007");

        p1.upScore(5);
        p1.upLevel(1);
        p1.upBonus(2);


        p2.upScore(6);
        p2.upLevel(2);
        p2.upBonus(1);

        System.out.println("The player1 have: "+p1.getScore()+" of score, and your level is: "+p1.getLevel());
        System.out.println("The player1 have: "+p2.getScore()+" of score, and your level is: "+p2.getLevel());
    }


}