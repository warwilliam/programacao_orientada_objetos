package com.war.firstSpring.resources;

import java.util.List;
import java.util.Optional;

public interface IDao <T> {

    public T save(T t) throws Exception;
    public Optional<T> searchById(Integer id) throws Exception;
    public void delete(Integer id) throws Exception;
    public List<T> searchAll() throws Exception;
    public T update(T t) throws Exception;

}
