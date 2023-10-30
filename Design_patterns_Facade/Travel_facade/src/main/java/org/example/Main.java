package org.example;

import org.example.model.Trip;
import org.example.service.impl.FacadeTurism;

public class Main {
    public static void main(String[] args) {

        FacadeTurism facadeTurism = new FacadeTurism();
        Trip trip = new Trip("01-01-2023","10-01-2023","São Paulo","California");
        System.out.println(facadeTurism.buscas(trip));

    }
}