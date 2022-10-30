package com.agenciadeviajes.flight.service;

import com.agenciadeviajes.flight.dto.FlightReservationDTO;
import com.agenciadeviajes.flight.dto.ListFlightReservationDTO;
import com.agenciadeviajes.flight.repository.FlightRepository;
import com.agenciadeviajes.flight.repository.FlightReservationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightReservationServiceImple implements FlightReservationService{

    public FlightReservationServiceImple() {
        FlightReservationRepository flightReservationRepository;
        FlightRepository flightRepository;
    }

    @Override
    public void createFlightReservation() {

    }

    @Override
    public void updateFlightReservation() {

    }

    @Override
    public void deleteFlightReservation() {

    }

    @Override
    public ListFlightReservationDTO getAllReservations() {
        List<FlightReservationDTO> flightReservationDTOS;
        return new ListFlightReservationDTO();
    }
}
