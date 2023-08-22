package com.neebal.movieticket.entities;
import jakarta.persistence.*;
import java.util.*;


@Entity
@Table(name="movies")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column

    private String title;
    @Column
    private String genre;
    @Column
    private int duration;

    @OneToMany(mappedBy = "movie")
    private List<MovieAuditorium> movieAuditoriums;


    public Movie(){}

    public Movie(Long id, String title, String genre, int duration) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.duration = duration;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public List<MovieAuditorium> getMovieAuditoriums() {
        return movieAuditoriums;
    }

    public void setMovieAuditoriums(List<MovieAuditorium> movieAuditoriums) {
        this.movieAuditoriums = movieAuditoriums;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", duration=" + duration +
                ", movieAuditoriums=" + movieAuditoriums +
                '}';
    }
}
