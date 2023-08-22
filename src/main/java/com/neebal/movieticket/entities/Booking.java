package com.neebal.movieticket.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long booking_id;

    @ElementCollection
    private List<String> bookedSeats;

    private LocalDateTime bookingTime;

    private boolean active;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "movie_theater_id")
    private MovieTheater movieTheater;




    public Booking() {

    }


    public Booking(List<String> bookedSeats, LocalDateTime bookingTime, boolean active) {
        this.bookedSeats = bookedSeats;
        this.bookingTime = bookingTime;
        this.active = active;
    }

    public Long getBooking_id() {
        return booking_id;
    }

    public void setBooking_id(Long booking_id) {
        this.booking_id = booking_id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public MovieTheater getMovieTheater() {
        return movieTheater;
    }

    public void setMovieTheater(MovieTheater movieTheater) {
        this.movieTheater = movieTheater;
    }

    public List<String> getBookedSeats() {
        return bookedSeats;
    }

    public void setBookedSeats(List<String> bookedSeats) {
        this.bookedSeats = bookedSeats;
    }

    public LocalDateTime getBookingTime() {
        return bookingTime;
    }

    public void setBookingTime(LocalDateTime bookingTime) {
        this.bookingTime = bookingTime;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "booking_id=" +booking_id +
                ", bookingTime=" + bookingTime +
                ", active=" + active +
                '}';
    }
}
