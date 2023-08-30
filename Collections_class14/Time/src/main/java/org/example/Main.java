package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Player> players = new ArrayList<>();

        Player p1 = new Player(66,"Romario", true,true);

        Player p2 = new Player(10, "Rivaldo", true, true);

        Player p3 = new Player(9, "Alejo", false, false);

        Time palmeiras = new Time("Palmeiras", players);
        palmeiras.addPlayer(p1);
        palmeiras.addPlayer(p2);
        palmeiras.addPlayer(p3);

        palmeiras.showHurtPlayers();
        palmeiras.showStartingPlayers();

        System.out.println("O time "+palmeiras.name+ " inicia a partida com os jogadores: "+ palmeiras.showStartingPlayers());
        System.out.println("O time "+palmeiras.name+ " tem: "+ palmeiras.showHurtPlayers()+" jogadores lesionados");


    }


}