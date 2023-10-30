package org.example.dao;

import org.example.model.Address;

public interface IDao<T> {

    public T save(T t) throws Exception;


}
