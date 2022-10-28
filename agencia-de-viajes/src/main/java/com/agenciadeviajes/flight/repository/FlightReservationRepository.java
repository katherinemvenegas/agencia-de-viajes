package com.agenciadeviajes.flight.repository;

import com.agenciadeviajes.flight.model.FlightReservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightReservationRepository extends JpaRepository<FlightReservation, Long> {
}
