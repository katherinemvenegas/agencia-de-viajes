package com.agenciadeviajes.flight.service;

import com.agenciadeviajes.flight.dto.FlightCreateDTO;
import com.agenciadeviajes.flight.dto.FlightUpdateDTO;
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
    public void createFlight(FlightCreateDTO flightCreateDTO) {
        String flightCode = flightCreateDTO.getFlightCode();
        Flight flight;

        if(!this.isFlightCodeExist(flightCode)){
            flight = modelMapper.map(flightCreateDTO, Flight.class);
            flightRepository.save(flight);
        }



    }
    @Override
    public void updateFlight(String flightCode, FlightUpdateDTO flightUpdateDTO) {
        Flight flight = flightRepository.findByFlightCode(flightCode);
        if(!this.isFlightAlreadyExist(flightCode)){
            Flight flightUpdate = modelMapper.map(flightUpdateDTO, Flight.class);
            flightUpdate.setId(flight.getId());
            flightUpdate.setFlightCode(flight.getFlightCode());
            flightRepository.save(flightUpdate);
        }
    }

    @Override
    public void deleteFlight() {

    }

    @Override
    public ListFlightDTO getAll() {

        List<FlightCreateDTO> flightCreateDTOList = flightRepository.findAll()
                .stream().map(flight -> modelMapper.map(flight, FlightCreateDTO.class))
                .collect(Collectors.toList());

        return new ListFlightDTO(flightCreateDTOList);
    }

    private boolean isFlightCodeExist(String flightCode){
             if(flightRepository.existsByFlightCode(flightCode)){
                 throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Ya existe un vuelo con el codigo ingresado");
             }else {
                 return false;
             }
        }

    private boolean isFlightAlreadyExist(String flightCode){
        if(!flightRepository.existsByFlightCode(flightCode)){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "No encontramos un vuelo con el codigo ingresado");
        }else {
            return false;
        }
    }
    }

