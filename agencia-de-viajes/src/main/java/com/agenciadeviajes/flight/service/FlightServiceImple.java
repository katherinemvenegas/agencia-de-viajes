package com.agenciadeviajes.flight.service;

import com.agenciadeviajes.flight.dto.FlightDTO;
import com.agenciadeviajes.flight.dto.ListFlightDTO;
import com.agenciadeviajes.flight.model.Flight;
import com.agenciadeviajes.flight.repository.FlightRepository;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import java.util.List;

@Service
public class FlightServiceImple implements FlightService{


    private FlightRepository flightRepository;
    public FlightServiceImple() {
        FlightRepository flightRepository;
    }

    @Override
    public void createFlight(FlightDTO flightDTO) {
        Flight flight = new Flight();
        String flightCode = flightDTO.getFlightCode();
        flight.setFlightCode(flightDTO.getFlightCode());
        flight.setOrigin(flightDTO.getOrigin());
        flight.setDestination(flightDTO.getDestination());
        flight.setFlightPrice(flightDTO.getFlightPrice());
        this.flightRepository.save(flight);

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
