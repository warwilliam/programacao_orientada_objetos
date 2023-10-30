package org.example;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.example.model.Address;

public class Main {

    public static final Logger LOGGER = Logger.getLogger(Main.class);

    public static void main(String[] args) {

        BasicConfigurator.configure();

        Address address = new Address();
        address.setStreet("Manoel carvalho");
        address.setNumber("88");
        address.setCity("Itapeva");
        address.setNeghborhood("Champs Elisé");


        System.out.println(address);
    }
}