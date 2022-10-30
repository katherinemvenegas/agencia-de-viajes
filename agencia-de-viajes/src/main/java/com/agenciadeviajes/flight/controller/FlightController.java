package com.agenciadeviajes.flight.controller;

import com.agenciadeviajes.flight.dto.FlightCreateDTO;
import com.agenciadeviajes.flight.dto.FlightUpdateDTO;
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
    public ResponseEntity<String> createFlight(@RequestBody FlightCreateDTO flightCreateDTO){

        flightServiceImple.createFlight(flightCreateDTO);
        return new ResponseEntity<>("El vuelvo fue dado de alta correctamente", HttpStatus.CREATED);
    }

    @GetMapping("")
    public ResponseEntity<ListFlightDTO> getFlights(){
        return new ResponseEntity<>(flightServiceImple.getAll(), HttpStatus.OK);
    }

    @PutMapping("/edit")
    public ResponseEntity<String> updateFlight(@RequestParam String flightCode, @RequestBody FlightUpdateDTO flightUpdateDTO){
        flightServiceImple.updateFlight(flightCode, flightUpdateDTO);
        return new ResponseEntity<>("El " + flightCode +" se modificó correctamente", HttpStatus.OK);
    }


}
