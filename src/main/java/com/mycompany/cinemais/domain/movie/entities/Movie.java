package com.mycompany.cinemais.domain.movie.entities;

import java.util.UUID;

import com.mycompany.cinemais.domain.movie.enums.MovieCategory;
import com.mycompany.cinemais.domain.movie.enums.ParentalRating;

public class Movie {
  private final UUID id;
  private final MovieCategory category;
  private final ParentalRating parentalRating;
  private final String title;
  private final String director;
  private final String mainActor;
  private final int duration;

  public Movie(UUID id, MovieCategory category, ParentalRating parentalRating, String title, String director,
      String mainActor,
      int duration) {
    this.id = id;
    this.category = category;
    this.parentalRating = parentalRating;
    this.title = title;
    this.director = director;
    this.mainActor = mainActor;
    this.duration = duration;
  }

  public UUID getId() {
    return id;
  }

  public MovieCategory getCategory() {
    return category;
  }

  public ParentalRating getParentalRating() {
    return parentalRating;
  }

  public String getTitle() {
    return title;
  }

  public String getDirector() {
    return director;
  }

  public String getMainActor() {
    return mainActor;
  }

  public int getDuration() {
    return duration;
  }

}
