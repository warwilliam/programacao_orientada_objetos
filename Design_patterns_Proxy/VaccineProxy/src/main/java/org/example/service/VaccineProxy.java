package org.example.service;

import java.util.Date;

public class VaccineProxy implements DoVaccine {
    @Override
    public void vaccinePerson(String cpf, Date dateVaccine, String VaccineType) {

        if (dateVaccine.before(new Date())){
            VaccineService vaccineService = new VaccineService();
            vaccineService.vaccinePerson(cpf, dateVaccine, VaccineType);
            System.out.println("Vacina aplicada");
        } else {
            System.out.println("A data da vacina não pode ser posterior à hoje");
        }

    }
}
