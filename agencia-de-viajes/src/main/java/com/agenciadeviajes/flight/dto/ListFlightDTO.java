package com.agenciadeviajes.flight.dto;


import com.agenciadeviajes.flight.model.Flight;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class ListFlightDTO {

    private List<FlightDTO> flightDTOList;

}
