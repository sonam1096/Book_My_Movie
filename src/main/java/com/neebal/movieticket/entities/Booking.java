package com.neebal.movieticket.entities;
import jakarta.persistence.*;
import java.util.*;


@Entity
@Table(name="bookings")
class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User user;

    @ManyToOne
    private MovieAuditorium movieAuditorium;
    @Column
    private Long bookingTime;
    @Column
    private boolean active;

    @OneToMany(mappedBy = "booking")
    private List<Seat> bookedSeats;


    public Booking(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public MovieAuditorium getMovieAuditorium() {
        return movieAuditorium;
    }

    public void setMovieAuditorium(MovieAuditorium movieAuditorium) {
        this.movieAuditorium = movieAuditorium;
    }

    public Long getBookingTime() {
        return bookingTime;
    }

    public void setBookingTime(Long bookingTime) {
        this.bookingTime = bookingTime;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public List<Seat> getBookedSeats() {
        return bookedSeats;
    }

    public void setBookedSeats(List<Seat> bookedSeats) {
        this.bookedSeats = bookedSeats;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "id=" + id +
                ", user=" + user +
                ", movieAuditorium=" + movieAuditorium +
                ", bookingTime=" + bookingTime +
                ", active=" + active +
                ", bookedSeats=" + bookedSeats +
                '}';
    }
}

