package com.agenciadeviajes.flight.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class FlightReservationDTO {

    private Long id;

    private String flightCode;

    @NotBlank(message = "El lugar de origen, no puede estar vacio")
    private String origin;

    @NotBlank(message = "El lugar de destino, no puede estar vacio")
    private String destination;

    private int seats;

    private String seatType;
}
