package org.example;

public class Object {
    
    protected int posX; 
    protected int posy;
    protected char direction;

    public Object(int posX, int posy, char direction) {
        this.posX = posX;
        this.posy = posy;
        this.direction = direction;
    }


    public java.lang.Object goToA(int x, int y, char direction){
        String actualPos = toString(x, y);
        return actualPos;
    }

    private String toString(int x, int y) {
        return x +" " +y;
    }
}
