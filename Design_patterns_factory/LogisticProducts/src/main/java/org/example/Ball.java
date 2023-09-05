package org.example;

public class Ball  extends Product{

   final double radius = 15;

    public double getRadius() {
        return radius;
    }

    @Override
    public double calcSpace() {
        double area;
        area = 4*Math.PI*(Math.pow(radius, 2));
        return area;
    }
}
