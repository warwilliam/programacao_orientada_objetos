package org.example.service;

import org.example.SerieException;
import org.example.model.Serie;

public class SerieService implements ISerieService {


    @Override
    public String getSerie(String nome) throws SerieException {
        String link = null;
        switch (nome){
            case "Goty":
                link = "movieflix.com/goty";
                break;
            case "Friends":
                link = "movieflix.com/friends";
                break;
            case "Breaking Bad":
                link = "movieflix.com/breakingbad";
                break;
            case "Cold case":
                link = "movieflix.com/coldcase";
                break;
        }

        return link;
    }

}
