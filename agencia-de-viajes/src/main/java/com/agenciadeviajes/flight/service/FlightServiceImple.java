package com.agenciadeviajes.flight.service;

import com.agenciadeviajes.flight.dto.FlightDTO;
import com.agenciadeviajes.flight.dto.ListFlightDTO;
import com.agenciadeviajes.flight.repository.FlightRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightServiceImple implements FlightService{

    public FlightServiceImple() {
        FlightRepository flightRepository;
    }

    @Override
    public void createFlight() {

    }
    @Override
    public void updateFlight() {

    }

    @Override
    public void deleteFlight() {

    }

    @Override
    public ListFlightDTO getAll() {
        List<FlightDTO> flightDTOS;
        return new ListFlightDTO();
    }
}
