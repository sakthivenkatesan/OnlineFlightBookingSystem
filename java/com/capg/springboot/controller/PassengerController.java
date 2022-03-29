package com.capg.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.capg.springboot.entity.Passenger;
import com.capg.springboot.exceptions.PassengerNotFoundException;
import com.capg.springboot.service.PassengerService;

@RestController
@RequestMapping("/addPassenger")
public class PassengerController {

	@Autowired
	private PassengerService passengerservice;
	
	@PostMapping("/addPassenger")
	public ResponseEntity<Passenger> addPassenger(@RequestBody Passenger add){
		passengerservice.addPassenger(add);
		return new ResponseEntity(add,HttpStatus.OK);
	}
	@DeleteMapping("/removePassenger")
	public ResponseEntity<Passenger> removePassenger(@RequestBody Passenger add){
		passengerservice.removePassenger(add);
		return new ResponseEntity(add,HttpStatus.OK);
	}
	@PutMapping("/updatePassenger")
	public ResponseEntity<Passenger> updatePassenger(@RequestBody Passenger add){
		passengerservice.updatePassenger(add);
		return new ResponseEntity(add,HttpStatus.OK);
	}
	
}