package org.example.service;

import org.example.model.Triangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlyweightFactoryTest {





    @Test
    void getTriangleTest() {
            Triangle triangle = FlyweightFactory.getTriangle("vermelho");
            triangle.setSize(2);

            Triangle triangle1 = FlyweightFactory.getTriangle("vermelho");
            triangle1.setSize(4);

            Triangle triangle2 = FlyweightFactory.getTriangle("azul");
            triangle2.setSize(7);

            assertEquals(triangle.getColor(), "vermelho");
            assertEquals(triangle1.getSize(), 4);
            assertEquals(FlyweightFactory.triangleMap.size() == 2, true);
    }
}
