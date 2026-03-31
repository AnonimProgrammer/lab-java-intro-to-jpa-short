package com.ironhack.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "flights")
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, unique = true)
    private String number;

    @Column(nullable = false)
    private String aircraft;

    @Column(name = "total_aircraft_seats", nullable = false)
    private Integer totalAircraftSeats;

    @Column(nullable = false)
    private Integer mileage;

    public Flight() {}
    public Flight(String number, String aircraft, Integer totalAircraftSeats, Integer mileage) {
        this.number = number;
        this.aircraft = aircraft;
        this.totalAircraftSeats = totalAircraftSeats;
        this.mileage = mileage;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
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