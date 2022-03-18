//Sakthi B V
package com.capg.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.capg.springboot.dto.UserDto;
import com.capg.springboot.entity.User;
import com.capg.springboot.service.UserService;

@RequestMapping("/userController")
@RestController

public class UserController 
{
	@Autowired
	private UserService userservice;
	
	//Add user method
	@PostMapping("/addUser")
	public ResponseEntity<User> addCustomer(@RequestBody UserDto customer)
	{
		User custImpl=userservice.addCustomer(customer);
		return new ResponseEntity(custImpl,HttpStatus.OK);
	}
	
	//Modify user method
	@PostMapping("/modifyUser")
	public ResponseEntity<User> modifyCustomer(@RequestBody UserDto customer)
	{
		User custImpl=userservice.modifyCustomer(customer);
		return new ResponseEntity(custImpl,HttpStatus.OK);
	}
	
	//Deleting an user
	@DeleteMapping("/deleteUser") 
	public ResponseEntity<User> removeCustomer(@RequestBody User customer)
	{
       User custImpl=userservice.removeCustomer(customer);
       return new ResponseEntity(custImpl,HttpStatus.OK); 
    }
	
	
}
