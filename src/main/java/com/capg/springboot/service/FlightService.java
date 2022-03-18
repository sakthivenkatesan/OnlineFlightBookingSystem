//Sasirekha U
package com.capg.springboot.service;

import com.capg.springboot.entity.Flight;
import com.capg.springboot.dto.FlightDto;
public interface FlightService {
	
	Flight addFlight(FlightDto flight);
	Flight modifyFlight(FlightDto flight);
	Flight deleteFlight(Flight flight);

}