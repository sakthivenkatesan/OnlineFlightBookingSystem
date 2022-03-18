//Manoj Kumar V
package com.capg.springboot.service;

import com.capg.springboot.entity.Booking;
import com.capg.springboot.dto.BookingDto;

public interface BookingService
{

	Booking makePayment(BookingDto payment);

	Booking cancelBooking(Booking payment);
	
}
