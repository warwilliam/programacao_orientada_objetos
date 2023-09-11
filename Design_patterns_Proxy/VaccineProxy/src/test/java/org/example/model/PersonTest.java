package org.example.model;

import org.example.service.DoVaccine;
import org.example.service.VaccineProxy;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    Date dataVac = new Date();

    @Test
            public void testVacinar() {
        Person p1 = new Person("William", "Rodrigues", "090355544477", dataVac, "Jansen");
        DoVaccine doVaccine = new VaccineProxy();
        doVaccine.vaccinePerson(p1.getCpf(),p1.getDateVaccine(),p1.getVaccineName());
        System.out.println(p1);
    }

}