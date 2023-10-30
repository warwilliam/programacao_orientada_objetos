package org.example.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class FlyApi {

    public String searchFlys(String departureDate, String returnDate, String origin, String destiny ){

        List<String> linesFlys = Arrays.asList("LATAM", "Azul", "Gol");

        Random r = new Random();

        return linesFlys.get(r.nextInt(linesFlys.size()));

    }

}
