package org.example.service;

import org.example.model.Movie;

public class GridMovies implements IgridMovies{
    @Override
    public Movie getMovie(String name) {
        Movie movie = null;
        switch (name){
            case "Pulp Fiction":
                movie = new Movie("Pulp Fiction", "Argentina", "movieflix.com.ar/titanic" );
                break;
            case "Matrix":
                movie = new Movie("Matrix", "Brasil", "movieflix.com.br/matrix");
                break;
            case "Kill Bill":
                movie = new Movie("Kill Bill", "Colombia", "movieflix.com.co/killbill");
                break;
            case "Cidade de deus":
                movie = new Movie("Cidade de deus", "Brasil", "movieflix.com.br/cidadededeus");
        }
        return movie;
    }
}
