package com.capg.springboot.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capg.springboot.entity.*;
import com.capg.springboot.repository.*;




@Service
@Transactional
public abstract class BookingServiceImplementation implements BookingService{

	@Autowired 
	private BookingRepository bookingrepository;
	
	

	public Booking makePayment(Booking payment) {
		
	  
		return ((BookingService) bookingrepository).makePayment(payment);
		
	}
	


	
	@Override
	public  Booking cancelBooking(Booking payment) {
		return null;
	} {
		Object payment = null;
		((BookingService) bookingrepository).cancelBooking((Booking) payment);
		
	}
	
//***************************************	
}