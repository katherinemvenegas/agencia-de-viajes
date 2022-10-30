package com.agenciadeviajes.flight.service;

import com.agenciadeviajes.flight.dto.FlightDTO;
import com.agenciadeviajes.flight.dto.ListFlightDTO;


public interface FlightService {
    void createFlight(FlightDTO flightDTO);
    void updateFlight(String flightCode, FlightDTO flightDTO);
    void deleteFlight();
    ListFlightDTO getAll();
}
