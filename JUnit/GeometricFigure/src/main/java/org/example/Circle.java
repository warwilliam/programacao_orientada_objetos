package org.example;

public class Circle extends Figure {

    private double ray;

    public Circle( double ray) {
        this.ray = ray;
    }

    public double getRay() {
        return ray;
    }

    public void setRay(double ray) {
        this.ray = ray;
    }

    @Override
    public double calcArea() {
        double area = 0.0;
        area = 2* Math.PI * this.ray;
        return area;
    }


}
