package com.capg.springboot.service;



import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capg.springboot.entity.*;
import com.capg.springboot.repository.*;




@Service
@Transactional
public class FlightServiceImplementation implements FlightService {

	@Autowired 
	private FlightRepository flightrepository;
	
	@Override
	public Flight addFlight(Flight flight) {
		
		flightrepository.save(flight);
	return flight;
	}
	
	@Override
	
	public Flight modifyFlight(Flight flight, int flightid) {
		Optional<Flight> a = flightrepository.findById(flightid);
		if(a.isPresent()) {
			Flight modified = a.get();
			modified.setId(flight.getId());
			modified.setDepartureLocation(flight.getDepartureLocation());
			modified.setArrivalLocation(flight.getArrivalLocation());
			modified.setDepartureTime(flight.getDepartureTime());
			modified.setArrivalTime(flight.getArrivalTime());
			flightrepository.save(modified);
			return modified;
		}
		return null;
	}
	
	@Override
	public Flight deleteFlight(Flight flight) {
		
		flightrepository.save(flight);
	return flight;
	}

	@Override
	public Flight modifyFlight(Flight flight) {
		// TODO Auto-generated method stub
		return null;
	}
	
}