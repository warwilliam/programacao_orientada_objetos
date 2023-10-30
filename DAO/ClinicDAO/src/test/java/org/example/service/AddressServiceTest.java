package org.example.service;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.example.dao.config.ConfigJDBC;
import org.example.dao.impl.AddressDaoH2;
import org.example.model.Address;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class AddressServiceTest {

        public static final Logger LOGGER = Logger.getLogger(AddressServiceTest.class);





        @BeforeAll
        public static void Config(){
                BasicConfigurator.configure();
        }


        AddressService addressService = new AddressService
                (new AddressDaoH2(
                        new ConfigJDBC()));



        @Test
        public void registerAddressinH2() throws Exception {
                Address address = new Address("jose padua", "88","Campinas","centro");
                LOGGER.info("salvando enderecos");
                Address address1 = new Address("Av. Brasil", "157","São Paulo","Lapa");
                Address address2 = new Address("rua 8", "55","Sertãozinho","Morro do Alemão");
                addressService.save(address);
                addressService.save(address1);
                addressService.save(address2);
        }
}