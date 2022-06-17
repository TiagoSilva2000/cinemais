package com.mycompany.cinemais.domain.movie.services;

import com.mycompany.cinemais.domain.movie.entities.Movie;

public interface IMovieService {
  public Movie create(Movie movie);

  public Movie read();

  public Movie update();

  public boolean delete();
}
