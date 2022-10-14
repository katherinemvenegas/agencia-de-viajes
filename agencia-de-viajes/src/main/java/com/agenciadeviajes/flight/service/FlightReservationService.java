package com.agenciadeviajes.flight.service;

import com.agenciadeviajes.flight.dto.ListFlightReservationDTO;

public interface FlightReservationService {

    void createFlightReservation();
    void updateFlightReservation();
    void deleteFlightReservation();
    ListFlightReservationDTO getAllReservations();
}
