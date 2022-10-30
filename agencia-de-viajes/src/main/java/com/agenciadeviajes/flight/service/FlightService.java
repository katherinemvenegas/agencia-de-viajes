package com.agenciadeviajes.flight.service;

import com.agenciadeviajes.flight.dto.FlightCreateDTO;
import com.agenciadeviajes.flight.dto.FlightUpdateDTO;
import com.agenciadeviajes.flight.dto.ListFlightDTO;


public interface FlightService {
    void createFlight(FlightCreateDTO flightCreateDTO);
    void updateFlight(String flightCode, FlightUpdateDTO flightUpdateDTO);
    void deleteFlight();
    ListFlightDTO getAll();
}
