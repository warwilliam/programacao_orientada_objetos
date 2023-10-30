package com.war.firstSpring.service;

import com.war.firstSpring.resources.IDao;
import com.war.firstSpring.model.Dentist;

import java.util.List;
import java.util.Optional;

public class DentistService {

    private IDao<Dentist> dentistIDao;

    public DentistService(IDao<Dentist> dentistIDao) {
        this.dentistIDao = dentistIDao;
    }

    public Dentist save(Dentist dentist) throws Exception {
        dentistIDao.save(dentist);
        return dentist;
    }

    public Optional<Dentist> searchById(Integer id) throws Exception {
        return dentistIDao.searchById(id);

    }

    public List<Dentist> searchAll() throws Exception {
        return dentistIDao.searchAll();
    }

    public void delete(Integer id) throws Exception {
        dentistIDao.delete(id);
    }

    public Dentist update(Dentist dentist)throws Exception{
        return dentistIDao.update(dentist);
    }

}
