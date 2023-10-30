package com.war.firstSpring.service;

import com.war.firstSpring.resources.IDao;
import com.war.firstSpring.model.Address;

import java.util.List;
import java.util.Optional;

public class AddressService {

    public IDao<Address> addressIDao;

    public AddressService(IDao<Address> addressIDao) {
        this.addressIDao = addressIDao;
    }

    public Address save(Address address) throws Exception {
        return addressIDao.save(address);
    }

    public List<Address> tekaAllAddress() throws Exception {
        return  addressIDao.searchAll();
    }

    public void deleteById(Integer id) throws Exception {
        addressIDao.delete(id);
    }

    public Optional<Address> searchById(Integer id) throws Exception {
        return addressIDao.searchById(id);
    }

    public Address update(Address address) throws Exception {
        return addressIDao.update(address);
    }
}
