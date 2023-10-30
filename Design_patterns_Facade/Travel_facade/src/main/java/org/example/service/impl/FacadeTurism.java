package org.example.service.impl;

import org.example.model.Trip;
import org.example.service.IFacadeTurism;

public class FacadeTurism implements IFacadeTurism {

    private FlyApi flyApi;
    private HotelApi hotelApi;

    public FacadeTurism() {

        flyApi = new FlyApi();
        hotelApi = new HotelApi();

    }

    @Override
    public Trip buscas(Trip trip) {
        String flyCompany =  flyApi.searchFlys(trip.getDepartureDate(),trip.getReturnDate(),trip.getOrigin(), trip.getDestiny());
        String hotel = hotelApi.searchHotel(trip.getDepartureDate(),trip.getReturnDate(),trip.getDestiny());
        Trip trip1 = new Trip(trip.getDepartureDate(),trip.getReturnDate(),trip.getOrigin(),trip.getDestiny());
        trip1.setFlyCompany(flyCompany);
        trip1.setHotel(hotel);

        return trip1;
         }

    }

