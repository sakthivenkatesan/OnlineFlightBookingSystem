//Sasirekha U
package com.capg.springboot.service;

import com.capg.springboot.entity.Flight;
public interface FlightService {
	
	Flight addFlight(Flight flight);
	Flight deleteFlight(Flight flight);
	Flight modifyFlight(Flight flight, int flightid);
}