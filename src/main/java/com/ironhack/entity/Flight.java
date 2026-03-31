package com.ironhack.entity;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "flights")
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private Long id;

    @Column(nullable = false, unique = true)
    private UUID number;

    @Column(nullable = false)
    private String aircraft;

    @Column(name = "total_aircraft_seats", nullable = false)
    private Integer totalAircraftSeats;

    @Column(nullable = false)
    private Integer mileage;

    public Flight() {}
    public Flight(UUID number, String aircraft, Integer totalAircraftSeats, Integer mileage) {
        this.number = number;
        this.aircraft = aircraft;
        this.totalAircraftSeats = totalAircraftSeats;
        this.mileage = mileage;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UUID getNumber() {
        return number;
    }

    public void setNumber(UUID number) {
        this.number = number;
    }

    public String getAircraft() {
        return aircraft;
    }

    public void setAircraft(String aircraft) {
        this.aircraft = aircraft;
    }

    public Integer getTotalAircraftSeats() {
        return totalAircraftSeats;
    }

    public void setTotalAircraftSeats(Integer totalAircraftSeats) {
        this.totalAircraftSeats = totalAircraftSeats;
    }

    public Integer getMileage() {
        return mileage;
    }

    public void setMileage(Integer mileage) {
        this.mileage = mileage;
    }
}