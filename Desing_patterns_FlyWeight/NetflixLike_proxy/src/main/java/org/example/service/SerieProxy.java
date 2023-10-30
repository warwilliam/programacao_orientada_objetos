package org.example.service;

import org.example.SerieException;

public class SerieProxy implements ISerieService{

     int count = 0;

    @Override
    public String getSerie(String nome) throws SerieException {
        if(count >= 5){
            throw new SerieException("Serie "+nome+" ultrapassou o limite de views, qtdviews: "+count );
        } SerieService serieService = new SerieService();
        serieService.getSerie(nome);
        count++;
        System.out.println("qtd de views: "+count);
        System.out.println(serieService.getSerie(nome));
        return serieService.getSerie(nome);
    }
}
