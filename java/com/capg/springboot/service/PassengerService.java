package com.capg.springboot.service;

import java.util.List;


import com.capg.springboot.entity.Passenger;
import com.capg.springboot.entity.User;
import com.capg.springboot.exceptions.PassengerNotFoundException;

public interface PassengerService {

	public Passenger addPassenger(Passenger add);
	public Passenger removePassenger(Passenger add);
	public Passenger updatePassenger(Passenger add);
	Passenger modifyPassenger(Passenger passenger, int passengerId);

}