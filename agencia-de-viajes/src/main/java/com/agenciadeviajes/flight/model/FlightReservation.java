package com.agenciadeviajes.flight.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table

public class FlightReservation {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String userName;

    @Column
    private int seats;

    @Column
    private String seatType;

    @ManyToOne
    @JoinColumn(name = "flight_id")
    private Flight flight;
}
