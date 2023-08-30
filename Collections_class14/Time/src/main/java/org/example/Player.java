package org.example;

public class Player implements Comparable {

    protected int numShirt;
    protected String name;
    protected boolean hurt;
    protected boolean startingPlayer;

    public Player(int numShirt, String name, boolean hurt, boolean startingPlayer) {
        this.numShirt = numShirt;
        this.name = name;
        this.hurt = hurt;
        this.startingPlayer = startingPlayer;
    }

    @Override
    public String toString() {
        return ", nome='" + name + '\'' +
                ", Camisa numero =" + numShirt;
    }

    public int getNumShirt() {
        return numShirt;
    }

    public void setNumShirt(int numShirt) {
        this.numShirt = numShirt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHurt() {
        return hurt;
    }

    public void setHurt(boolean hurt) {
        this.hurt = hurt;
    }

    public boolean isStartingPlayer() {
        return startingPlayer;
    }

    public void setStartingPlayer(boolean startingPlayer) {
        this.startingPlayer = startingPlayer;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
