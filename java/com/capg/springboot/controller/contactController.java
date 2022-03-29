//Manoj Kumar N
package com.capg.springboot.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.springboot.entity.Contact;
import com.capg.springboot.entity.User;
import com.capg.springboot.service.ContactService;

@RequestMapping("/contactController")
@RestController
public class contactController {
	@Autowired
	private ContactService contactservice;
	
	//Add contact method
	@PostMapping("/addContact")
	public ResponseEntity<Contact> addContact(@RequestBody Contact a)
	{
		contactservice.addContact(a);
		return new ResponseEntity(a ,HttpStatus.OK);
	}
	
	/*
	 * //Modify contact method
	 * 
	 * @PostMapping("/modifyContact") public ResponseEntity<Contact>
	 * modifyContact(@RequestBody Contact a) { contactservice.modifycontact(a);
	 * return new ResponseEntity(a ,HttpStatus.OK); }
	 * 
	 * //Deleting a contact
	 * 
	 * @DeleteMapping("/deleteContact") public ResponseEntity<Contact>
	 * removeContact(@RequestBody Contact a) { contactservice.removeCustomer(a);
	 * return new ResponseEntity(a ,HttpStatus.OK); }
	 */

}