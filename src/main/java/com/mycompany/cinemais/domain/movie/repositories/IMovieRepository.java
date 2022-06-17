package com.mycompany.cinemais.domain.movie.repositories;

import com.mycompany.cinemais.domain.movie.entities.Movie;

public interface IMovieRepository {
  public Movie create(Movie movie);

  public Movie read();

  public Movie update();

  public boolean delete();
}
