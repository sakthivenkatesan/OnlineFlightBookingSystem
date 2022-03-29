//Sasirekha U
package com.capg.springboot.controller;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.http.HttpStatus;
	import org.springframework.http.ResponseEntity;
	import org.springframework.web.bind.annotation.DeleteMapping;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RestController;
	import com.capg.springboot.entity.Flight;
	import com.capg.springboot.service.FlightService;

@SuppressWarnings("unused")
@RequestMapping("/FlightController")
@RestController
public class FlightController
	{
		@Autowired
		private com.capg.springboot.service.FlightService FlightService;
		
		//Add flight method
		@PostMapping("/addFlight")
		public ResponseEntity<Flight> addFlight(@RequestBody Flight flight)
		{
			FlightService.addFlight(flight);
			return new ResponseEntity<Flight>(flight,HttpStatus.OK);
		}
		
		/*
		 * //Modify flight method
		 * 
		 * @PostMapping("/modifyFlight") public ResponseEntity<Flight>
		 * modifyFlight(@RequestBody Flight flight) { Flight
		 * custImpl=FlightService.modifyFlight(flight); return new
		 * ResponseEntity<Flight>(custImpl,HttpStatus.OK); }
		 */
		
		//Deleting flight
		@DeleteMapping("/deleteFlight") 
		public ResponseEntity<Flight> removeFlight(@RequestBody Flight flight)
		{
	       FlightService.deleteFlight(flight);
	       return new ResponseEntity<Flight>(flight,HttpStatus.OK); 
	    }
		
		
	}
