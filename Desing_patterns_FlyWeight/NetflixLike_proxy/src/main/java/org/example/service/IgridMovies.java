package org.example.service;

import org.example.MovieException;
import org.example.model.Movie;

public interface IgridMovies {

    public Movie getMovie(String name) throws MovieException;

}
