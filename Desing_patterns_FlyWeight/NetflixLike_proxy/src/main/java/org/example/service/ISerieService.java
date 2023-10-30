package org.example.service;

import org.example.SerieException;
import org.example.model.Serie;

public interface ISerieService {

    public String getSerie(String nome) throws SerieException;

 }


