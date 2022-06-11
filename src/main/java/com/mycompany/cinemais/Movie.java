
package com.mycompany.cinemais;

/**
 *
 * @author blueevee
 */
public class Movie {
    private Category category;
    private ParentalRating parentalRating;
    private String title;
    private String director;
    private String mainActor;
    private Integer duration;


    public Movie(Category category, ParentalRating parentalRating, String title, String director, String mainActor, Integer duration) {
        this.category = category;
        this.parentalRating = parentalRating;
        this.title = title;
        this.director = director;
        this.mainActor = mainActor;
        this.duration = duration;
    }

    public void SetCategory(Category category) {
        this.category = category;
    }
    public Category GetCategory() {
        return this.category;
    }
    public void SetParentalRating(ParentalRating parentalRating) {
        this.parentalRating = parentalRating;
    }
    public ParentalRating GetParentalRating() {
        return this.parentalRating;
    }
    public void SetTitle(String title) {
        this.title = title;
    }
    public String GetTitle() {
        return this.title;
    }
    public void SetDirector(String director) {
        this.director = director;
    }
    public String GetDirector() {
        return this.director;
    }
    public void SetMainActor(String mainActor) {
        this.mainActor = mainActor;
    }
    public String GetMainActor() {
        return this.mainActor;
    }
    public void SetDuration(Integer duration) {
        this.duration = duration;
    }
    public Integer GetDuration() {
        return this.duration;
    }
  
}
