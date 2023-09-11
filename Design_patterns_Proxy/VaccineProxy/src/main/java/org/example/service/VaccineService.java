package org.example.service;

import java.util.Date;

public class VaccineService implements DoVaccine{


    @Override
    public void vaccinePerson(String cpf, Date dateVaccine, String VaccineType) {

        System.out.println("Cidadão(a) "+cpf+" vacinado(a) em "+dateVaccine+" com sucesso.");

    }
}
