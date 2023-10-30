package com.war.firstSpring.service;

import com.war.firstSpring.resources.IDao;
import com.war.firstSpring.model.Patient;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PacientService {

    private IDao<Patient> patientIDao;

    public PacientService(IDao<Patient> patientIDao) {
        this.patientIDao = patientIDao;
    }

    public Patient save(Patient patient) throws Exception {
        patientIDao.save(patient);
        return patient;
    }

    public Optional<Patient> searchById(Integer id) throws Exception {
        return patientIDao.searchById(id);
    }

    public void delete(Integer id) throws Exception {
        patientIDao.delete(id);
    }

    public List<Patient> selectAll() throws Exception {
        List<Patient> patientList = new ArrayList<>();
        patientList = patientIDao.searchAll();
        System.out.println(patientList);
        return patientList;
    }

    public Patient update(Patient patient) throws Exception {
        return patientIDao.update(patient);
    }

}
