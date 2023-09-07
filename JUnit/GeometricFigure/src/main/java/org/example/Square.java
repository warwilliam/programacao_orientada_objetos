package org.example;

public class Square extends Figure {

    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double calcArea() {
        double area = 0.0;
        area = 4 * this.side;
        return area;
    }
}
