package org.example.service;

import org.example.model.Triangle;

import java.util.HashMap;

public class FlyweightFactory {

    public static final HashMap<String , Triangle> triangleMap = new HashMap<>();

    public static Triangle getTriangle(String color){
        Triangle triangle = triangleMap.get(color);

        if (triangle == null){
            triangle = new Triangle(color);
            triangleMap.put(color,triangle);
        }
        return triangle;
    }

}
