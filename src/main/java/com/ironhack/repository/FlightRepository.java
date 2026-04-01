package com.ironhack.repository;

import com.ironhack.entity.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface FlightRepository extends JpaRepository<Flight, Integer> {
    Optional<Flight> findByNumber(String number);

    List<Flight> findByAircraft(String aircraft);

    List<Flight> findByMileageBetween(Integer min, Integer max);
}
