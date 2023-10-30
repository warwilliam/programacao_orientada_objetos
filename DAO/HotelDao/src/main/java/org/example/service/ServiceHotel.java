package org.example.service;

import org.example.dao.IDao;
import org.example.model.Hotel;

public class ServiceHotel {

    public IDao<Hotel> hotelIDao;

    public ServiceHotel(IDao<Hotel> hotelIDao1){
        this.hotelIDao = hotelIDao1;
    }

    public Hotel save(Hotel hotel){
        return hotelIDao.save(hotel);
    }
}
