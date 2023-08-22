package com.neebal.movieticket.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Theater {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long theater_id;
    private String name;

    public Theater() {}


    public Long getTheater_id() {
        return theater_id;
    }

    public void setTheater_id(Long theater_id) {
        this.theater_id = theater_id;
    }

    public Theater(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Theater{" +
                "theater_id=" + theater_id +
                ", name='" + name + '\'' +
                '}';
    }
}
