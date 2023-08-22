package com.neebal.movieticket.entities;

import jakarta.persistence.*;


import java.util.List;

@Entity
public class MovieTheater {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long movieTheater_id;

    @ManyToOne
    @JoinColumn(name = "movie_id")
    private Movie movie;

    @ManyToOne
    @JoinColumn(name = "theater_id")
    private Theater theater;

    // Other fields
    private Long startTime;
    private Long endTime;

    @OneToMany(mappedBy = "movieTheater", cascade = CascadeType.ALL)
    private List<Booking> bookings;

    @OneToMany(mappedBy = "movieTheater", cascade = CascadeType.ALL)
    private List<Seat> seats;

    public MovieTheater(Long startTime, Long endTime, List<Booking> bookings) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.bookings = bookings;
    }

    public Long getMovieTheater_id() {
        return movieTheater_id;
    }

    public void setMovieTheater_id(Long movieTheater_id) {
        this.movieTheater_id = movieTheater_id;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Theater getTheater() {
        return theater;
    }

    public void setTheater(Theater theater) {
        this.theater = theater;
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

    public List<Seat> getSeats() {
        return seats;
    }

    public void setSeats(List<Seat> seats) {
        this.seats = seats;
    }

    @Override
    public String toString() {
        return "MovieTheater{" +
                "movieTheater_id=" + movieTheater_id +
                ", movie=" + movie +
                ", theater=" + theater +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", bookings=" + bookings +
                ", seats=" + seats +
                '}';
    }
}
