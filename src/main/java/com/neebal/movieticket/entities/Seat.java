package com.neebal.movieticket.entities;


import jakarta.persistence.*;

@Entity
class Seat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String seatIdentifier;
    @ManyToOne
    @JoinColumn(name = "movieTheater_id")
    private MovieTheater movieTheater;



    public Seat (){}

    public Seat( String seatIdentifier) {
        this.seatIdentifier = seatIdentifier;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public MovieTheater getMovieTheater() {
        return movieTheater;
    }

    public void setMovieTheater(MovieTheater movieTheater) {
        this.movieTheater = movieTheater;
    }

    public String getSeatIdentifier() {
        return seatIdentifier;
    }

    public void setSeatIdentifier(String seatIdentifier) {
        this.seatIdentifier = seatIdentifier;
    }

    @Override
    public String toString() {
        return "Seat{" +
                "id=" + id +
                ", movieTheater=" + movieTheater +
                ", seatIdentifier='" + seatIdentifier + '\'' +
                '}';
    }
}
