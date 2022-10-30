package com.agenciadeviajes.flight.repository;

import com.agenciadeviajes.flight.model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Long> {

    boolean existsByFlightCode(String flightCode);

    Flight findByFlightCode(String flightCode);
}
