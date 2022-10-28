package com.agenciadeviajes.flight.controller;

import com.agenciadeviajes.flight.dto.FlightDTO;
import com.agenciadeviajes.flight.dto.ListFlightDTO;
import com.agenciadeviajes.flight.service.FlightServiceImple;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/v1/flights")
@Validated
public class FlightController {

    private FlightServiceImple flightServiceImple;

    public FlightController(FlightServiceImple flightServiceImple){
       this.flightServiceImple = flightServiceImple;
    }

    @PostMapping("/new")
    public ResponseEntity<String> createFlight(@RequestBody FlightDTO flightDTO){

        flightServiceImple.createFlight(flightDTO);
        return new ResponseEntity<>("El vuelvo fue dado de alta correctamente", HttpStatus.CREATED);
    }

    @GetMapping("")
    public ResponseEntity<ListFlightDTO> getFlights(){
        return new ResponseEntity<>(flightServiceImple.getAll(), HttpStatus.OK);
    }
}
