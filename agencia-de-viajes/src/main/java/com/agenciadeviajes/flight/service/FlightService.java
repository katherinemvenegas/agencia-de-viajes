package com.agenciadeviajes.flight.service;

import com.agenciadeviajes.flight.dto.FlightDTO;


public interface FlightService {
    void createFlight(FlightDTO flightDTO);
    void updateFlight();
    void deleteFlight();
    ListFlightDTO getAll();
}
