package org.example.service;

import org.example.dao.IDao;
import org.example.model.Address;

public class AddressService {

    public IDao<Address> addressIDao;

    public AddressService(IDao<Address> addressIDao) {
        this.addressIDao = addressIDao;
    }

    public Address save(Address address) throws Exception {
      return addressIDao.save(address);
    }
}
