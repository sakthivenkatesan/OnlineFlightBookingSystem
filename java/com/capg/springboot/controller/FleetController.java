package com.capg.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.capg.springboot.entity.Fleet;
import com.capg.springboot.service.FleetService;



@RequestMapping("/FleetController")
@RestController


public class FleetController {
	@Autowired
	private FleetService Fleetservice;
	
	//Add Fleet method
	@PostMapping("/addFleet")
	public ResponseEntity<Fleet> addCustomer(@RequestBody Fleet customer)
	{
		Fleetservice.addFleet(customer);
		return new ResponseEntity(customer,HttpStatus.OK);
	}
	
	//Modify Fleet method
	@PostMapping("/modifyFleet")
	public ResponseEntity<Fleet> modifyCustomer(@RequestBody Fleet customer)
	{
		Fleetservice.modifyFleet(customer);
		return new ResponseEntity(customer,HttpStatus.OK);
	}
	
	//Deleting a Fleet
	@DeleteMapping("/deleteFleet") 
	public ResponseEntity<Fleet> removeFleet(@RequestBody Fleet fleet)
	{
       Fleetservice.removeFleet(fleet);
       return new ResponseEntity(fleet,HttpStatus.OK); 
    }
}