package com.agenciadeviajes.flight.dto;


import com.agenciadeviajes.flight.repository.FlightRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ListFlightReservationDTO {
    private List<FlightReservationDTO> flightReservationDTOList;
}
