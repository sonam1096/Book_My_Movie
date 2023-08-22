package com.neebal.movieticket.entities;
import jakarta.persistence.*;
import java.util.*;


@Entity
@Table(name="movieauditoriums")
public class MovieAuditorium {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Movie movie;

    @ManyToOne
    private Auditorium auditorium;
    @Column
    private Long startTime;
    @Column
    private Long endTime;

    @OneToMany(mappedBy = "movieAuditorium")
    private List<Booking> bookings;


    public MovieAuditorium(){}

    public MovieAuditorium(Long startTime, Long endTime ) {
        this.startTime = startTime;
        this.endTime = endTime;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Auditorium getAuditorium() {
        return auditorium;
    }

    public void setAuditorium(Auditorium auditorium) {
        this.auditorium = auditorium;
    }

    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }

    @Override
    public String toString() {
        return "MovieAuditorium{" +
                "id=" + id +
                ", startTime=" + startTime +
                ", endTime=" + endTime +

                '}';
    }
}

