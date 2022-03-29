//Anantha Krishnan V S
package com.capg.springboot.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.capg.springboot.entity.Location;
import com.capg.springboot.service.LocationService;


@RequestMapping("/LocationController")
@RestController


public class LocationController {
	@Autowired
	private LocationService locationservice;
	
	//Add user method
	@PostMapping("/addLocation")
	public ResponseEntity<Location> addCustomer(@RequestBody Location customer)
	{
		locationservice.addCustomer(customer);
		return new ResponseEntity(customer,HttpStatus.OK);
	}
	
	//Modify user method
	@PostMapping("/modifyLocation")
	public ResponseEntity<Location> modifyCustomer(@RequestBody Location customer)
	{
		Location custImpl=locationservice.modifyCustomer(customer);
		return new ResponseEntity(custImpl,HttpStatus.OK);
	}
	
	//Deleting an user
	@DeleteMapping("/deleteLocation") 
	public ResponseEntity<Location> removeCustomer(@RequestBody Location customer)
	{
       locationservice.removeCustomer(customer);
       return new ResponseEntity(customer,HttpStatus.OK); 
    }
	
}
