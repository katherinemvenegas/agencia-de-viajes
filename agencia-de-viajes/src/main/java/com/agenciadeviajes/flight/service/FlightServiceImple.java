package com.agenciadeviajes.flight.service;

import com.agenciadeviajes.flight.dto.FlightDTO;
import com.agenciadeviajes.flight.dto.ListFlightDTO;
import com.agenciadeviajes.flight.model.Flight;
import com.agenciadeviajes.flight.repository.FlightRepository;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FlightServiceImple implements FlightService{


    private FlightRepository flightRepository;

    private ModelMapper modelMapper = new ModelMapper();
    public FlightServiceImple(FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }

    @Override
    public void createFlight(FlightDTO flightDTO) {
        String flightCode = flightDTO.getFlightCode();
        Flight flight;

        if(!this.flightExist(flightCode)){
            flight = modelMapper.map(flightDTO, Flight.class);
            flightRepository.save(flight);
        }



    }
    @Override
    public void updateFlight(String flightCode, FlightDTO flightDTO) {



    }

    @Override
    public void deleteFlight() {

    }

    @Override
    public ListFlightDTO getAll() {

        List<FlightDTO> flightDTOList = flightRepository.findAll()
                .stream().map(flight -> modelMapper.map(flight, FlightDTO.class))
                .collect(Collectors.toList());

        return new ListFlightDTO(flightDTOList);
    }

    private boolean flightExist(String flightCode){
             if(flightRepository.existsByFlightCode(flightCode)){
                 throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Ya existe un vuelo con el codigo ingresado");
             }else {
                 return false;
             }
        }
    }

