//Manoj Kumar V
package com.capg.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.capg.springboot.dto.BookingDto;
import com.capg.springboot.entity.Booking;
import com.capg.springboot.service.BookingService;

@RequestMapping("/BookingController")
@RestController

public class BookingController 
{
	@Autowired
	private BookingService bookingservice;
	
	
	@PostMapping("/makePayment")
	public ResponseEntity<Booking> makepayment(@RequestBody BookingDto payment)
	{
		
		Booking custImpl=bookingservice.makePayment(payment);
		return new ResponseEntity(custImpl,HttpStatus.OK);
		
	}
	
	//Booking makePayment(BookingDto payment);
	//Booking cancelBooking(Booking payment);
	
	@DeleteMapping("/cancelBooking") 
	public ResponseEntity<Booking> cancelbooking(@RequestBody Booking payment)
	{
		Booking custImpl=bookingservice.cancelBooking(payment);
       return new ResponseEntity(custImpl,HttpStatus.OK); 
    }
	
	
}