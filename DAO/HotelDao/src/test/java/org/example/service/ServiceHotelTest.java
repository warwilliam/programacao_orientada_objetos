package org.example.service;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.example.dao.config.ConfigJDBC;
import org.example.dao.impl.HotelDaoH2;
import org.example.model.Hotel;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServiceHotelTest {

    public static final Logger LOGGER = Logger.getLogger(ServiceHotelTest.class);

    @BeforeAll
    public static void  Config(){
        BasicConfigurator.configure();
    }

    ServiceHotel serviceHotel = new ServiceHotel(
            new HotelDaoH2(
                    new ConfigJDBC()));

    @Test
    public void registerNewHotelH2(){
        LOGGER.info("iniciando");
        Hotel hotel1 = new Hotel("hilton","main","54","Los Angeles","California",true);
        Hotel hotel2 = new Hotel("Cecil","elm street","666","Hollywood","California",true);
        Hotel hotel3 = new Hotel("Copacaban","Brasil","545","Campinas","São Paulo",true);
        Hotel hotel4 = new Hotel("Purgueiro","sem nome","0","Los boot of Judas","anywhere",false);
        Hotel hotel5 = new Hotel("just a bed","Hell kitchen","59b","New jersey","New york",false);
        LOGGER.info("Terminando de salvar");
    }

}