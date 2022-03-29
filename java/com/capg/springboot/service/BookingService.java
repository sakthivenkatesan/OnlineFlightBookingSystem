//Manoj Kumar V
package com.capg.springboot.service;

import com.capg.springboot.entity.Booking;

public interface BookingService
{

	Booking makePayment(Booking payment);

	Booking cancelBooking(Booking payment);
	
}
