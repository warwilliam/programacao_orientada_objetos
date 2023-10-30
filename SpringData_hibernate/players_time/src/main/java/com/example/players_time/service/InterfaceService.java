package com.example.players_time.service;

import com.example.players_time.model.Team;

import java.util.List;
import java.util.Optional;

public interface InterfaceService<T> {

     public List<T> searchAll();
    public Optional<T> searchById(Long id);
    public void delete(Long id);
    public Object save(T t);
    public T update(T t);



}
