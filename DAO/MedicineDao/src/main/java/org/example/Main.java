package org.example;

import org.example.dao.config.ConfigJDBC;
import org.example.dao.impl.MedicineDaoH2;
import org.example.model.Medicine;
import org.example.service.MedicineService;

public class Main {
    public static void main(String[] args) throws Exception {

         MedicineService medicineService = new MedicineService(
                new MedicineDaoH2(
                        new ConfigJDBC()));

        Medicine medicine = new Medicine("dipirona","Medley",345,19.90);

        medicineService.salvar(medicine);

    }
}