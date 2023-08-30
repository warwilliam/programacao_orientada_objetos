package org.example;

import java.util.ArrayList;
import java.util.List;

public class Time {

    protected String name;
    protected List<Player> players;


    public Time(String name, List<Player> players) {
        this.name = name;
        this.players = players;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public void addPlayer(Player p){
       this.players.add(p);
    }

    public List showStartingPlayers(){
            List<Player> startingPlayers = new ArrayList<>();

            for (Player player : players) {
                if (player.startingPlayer) {
                    startingPlayers.add(player);
                }
            }
            return startingPlayers;
    }

    public int showHurtPlayers(){
        List<Player> hurtsPlayers =  new ArrayList<>();

        for (Player player : players) {
            if (player.hurt) {
                hurtsPlayers.add(player);
            }
        }

        return hurtsPlayers.size();
    }

}
