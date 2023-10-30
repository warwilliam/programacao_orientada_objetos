package org.example.service.impl;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class HotelApi {

    public String searchHotel(String departureDate, String returnDate, String city){

        List<String> hotels = Arrays.asList("Cecil Hotel", "Hotel California", "Hotel Hilton");

        Random r = new Random();

        return hotels.get(r.nextInt(hotels.size()));


    }

}
