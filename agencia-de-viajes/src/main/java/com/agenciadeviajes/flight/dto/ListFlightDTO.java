package com.agenciadeviajes.flight.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class ListFlightDTO {

    private List<FlightCreateDTO> flightCreateDTOList;

}
