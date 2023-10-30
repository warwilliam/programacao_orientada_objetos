package org.example;

import org.example.model.Ip;
import org.example.service.*;

public class User {
    public static void main(String[] args) throws SerieException {
        GridMoviesProxy proxy = new GridMoviesProxy(new GridMovies());
        proxy.setIp(new Ip(48,168,01,01));

        GridMoviesProxy proxy1 = new GridMoviesProxy(new GridMovies());
        proxy1.setIp(new Ip(98,168,01,01));

        GridMoviesProxy proxy2 = new GridMoviesProxy(new GridMovies());
        proxy2.setIp(new Ip(143,168,01,01));

        SerieProxy serieProxy = new SerieProxy();
        serieProxy.getSerie("Goty");
        serieProxy.getSerie("Friends");
        serieProxy.getSerie("Breaking Bad");
        serieProxy.getSerie("Cold case");
        serieProxy.getSerie("Goty");
        serieProxy.getSerie("Goty");


        try{
            System.out.println(proxy.getMovie("Pulp Fiction").getLink());

        }catch (MovieException exception){
            System.err.println(exception);
        }

        try{
            System.out.println(proxy.getMovie("Matrix").getLink());

        }catch (MovieException exception){
            System.err.println(exception);
        }

        try{
            System.out.println(proxy1.getMovie("Matrix").getLink());

        }catch (MovieException exception){
            System.err.println(exception);
        }

        try{
            System.out.println(proxy1.getMovie("Pulp Fiction").getLink());

        }catch (MovieException exception){
            System.err.println(exception);
        }

        try{
            System.out.println(proxy2.getMovie("Pulp Fiction").getLink());

        }catch (MovieException exception){
            System.err.println(exception);
        }

        try{
            System.out.println(proxy2.getMovie("Kill Bill").getLink());

        }catch (MovieException exception){
            System.err.println(exception);
        }
    }



}