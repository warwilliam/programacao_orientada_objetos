package org.example.service;

import org.example.MovieException;
import org.example.model.Ip;
import org.example.model.Movie;

public class GridMoviesProxy implements IgridMovies{
    private GridMovies grid;
    private Ip ip;

    public GridMoviesProxy(GridMovies grid) {
        this.setGrid(grid);
    }

    public Ip getIp(){
        return ip;
    }

    public void setIp(Ip ip){
        this.ip = ip;
    }

    public void setGrid(GridMovies gridMovies){
        this.grid = gridMovies;
    }
    @Override
    public Movie getMovie(String name) throws MovieException {
        Movie movie = grid.getMovie(name);
        if (!(getIp().getCountry().equalsIgnoreCase(movie.getCountry()))){
            throw new MovieException(name + " não disponivel no "+getIp().getCountry());
        }
        return movie;
    }
}
