package com.agenciadeviajes.flight.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table

public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String flightCode;

    @Column
    @NotBlank(message = "El lugar de origen no puede estar vacio")
    private String origin;

    @Column
    @NotBlank(message = "El lugar de destino no puede estar vacio")
    private String destination;

    @Column
    private Double flightPrice;

    @OneToMany(mappedBy = "flight")
    private List<FlightReservation> flightReservations;
}
