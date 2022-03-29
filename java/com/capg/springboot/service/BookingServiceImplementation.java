package com.capg.springboot.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capg.springboot.entity.Booking;
import com.capg.springboot.repository.BookingRepository;




@Service
@Transactional
public class BookingServiceImplementation implements BookingService{

	@Autowired 
	private BookingRepository bookingrepository;
	
	
	@Override
	public Booking makePayment(Booking payment) {
		
	  
		return ((BookingService) bookingrepository).makePayment(payment);
		
	}
	
	
	/*@Override
	public  Booking cancelBooking(Booking payment) {
		Object payment = null;
		//((BookingService) bookingrepository).cancelBooking((Booking) payment);
		bookingrepository.cancelBooking
		return null;
	}
	*/
//***************************************	
}