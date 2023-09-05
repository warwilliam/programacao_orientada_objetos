package org.example;

public class Box extends Product{

    final double lenght = 10;
    final double height = 10;
    final double width = 10;




    @Override
    public double calcSpace() {
        double area;
        area = lenght*height*width;
        return area;
    }
}
