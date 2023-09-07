package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FigureTest {

    Figure circle1, square1;

    @BeforeEach
    void doBefore(){
        circle1 = new Circle(10);
        square1 = new Square(100);
    }

    @Test
    void calcAreaTest(){
        System.out.println(circle1.calcArea());
        assertTrue(circle1.calcArea() == 62.83185307179586);


    }

    @Test
    void calcSquareTest(){
        assertTrue(square1.calcArea() == 400.0);
        System.out.println(square1.calcArea());

    }

}