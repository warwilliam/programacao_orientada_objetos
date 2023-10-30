package org.example.service;

import org.example.dao.IDao;
import org.example.model.Medicine;

public class MedicineService {

    private IDao<Medicine> medicineIDao;

    public MedicineService(IDao<Medicine> medicineIDao){
        this.medicineIDao =medicineIDao;
    }

    public Medicine salvar(Medicine medicine) throws Exception {
        return medicineIDao.save(medicine);
    }

}
