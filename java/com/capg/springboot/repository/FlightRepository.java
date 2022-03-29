package com.capg.springboot.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.springboot.entity.Flight;
import com.capg.springboot.entity.User;


public interface FlightRepository extends JpaRepository<Flight, String>{

	
	
	abstract Flight addFlight(Flight add);

	
	abstract Flight modifyFlight(Flight add);
	

	abstract Flight removeFlight(Flight add);


	static Flight findUserById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	abstract Optional<Flight> findById(int flightid);
	
	}