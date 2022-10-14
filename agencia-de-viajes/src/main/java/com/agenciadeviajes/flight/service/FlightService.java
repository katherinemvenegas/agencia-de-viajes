package com.agenciadeviajes.flight.service;

import com.agenciadeviajes.flight.dto.ListFlightDTO;

public interface FlightService {
    void createFlight();
    void updateFlight();
    void deleteFlight();
    ListFlightDTO getAll();
}
