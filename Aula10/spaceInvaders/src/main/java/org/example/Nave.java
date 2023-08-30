package org.example;

public class Nave extends Object{

    protected double speed;
    protected int life;


    public Nave(int posX, int posy, char direction, double speed, int life) {
        super(posX, posy, direction);
        this.speed = speed;
        this.life = life;
    }

    @Override
    public java.lang.Object goToA(int x, int y, char direction) {
        return super.goToA(x, y, direction);
    }

    public void spine(char direction){
         this.direction = direction;
    }

    public int RemainLives(int valor){
        return this.life -= valor;
    }
}
