package com.capg.springboot.controller;

import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.capg.springboot.entity.User;
import com.capg.springboot.service.LoginService;

@RequestMapping("/LoginController")
@RestController
public class LoginController 
{
	private static final HttpStatus HttpStatus = null;

	@Autowired
	HttpSession session;
	
	@Autowired
	private LoginService loginservice;
	
	//Adding a user
	
	@PostMapping("/addUser")
	public ResponseEntity<User> addUser(@RequestBody User user)
	{
		if(user.getUserId() == 0)
			return new ResponseEntity("Invalid",HttpStatus.NOT_FOUND);
		User userImpl=loginservice.addUser(user);
		return new ResponseEntity(userImpl,HttpStatus.OK);	
	}
	
	//Deleting Existing User
	
	@DeleteMapping("/removeUser")
	public ResponseEntity<User> removeUser(@RequestBody User user){
		if(user.getUserId()== 0)
			return new ResponseEntity("Invalid",HttpStatus.NOT_FOUND);
		User userImpl=loginservice.removeUser(user);
		return new ResponseEntity(userImpl,HttpStatus.OK);
		
	}
	
	//Signing out
	
	@GetMapping("/signOut")
	public ResponseEntity<User> signOut(){
		session.invalidate();
		return new ResponseEntity("LoggedOut",HttpStatus.OK);
	}
	
	
}
