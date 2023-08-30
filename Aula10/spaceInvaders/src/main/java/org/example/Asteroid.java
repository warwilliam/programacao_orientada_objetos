package org.example;

public class Asteroid extends Object{

    protected int damage;

    public Asteroid(int posX, int posy, char direction, int damage) {
        super(posX, posy, direction);
        this.damage = damage;
    }

    @Override
    public java.lang.Object goToA(int x, int y, char direction) {
        return super.goToA(x, y, direction);
    }
}
