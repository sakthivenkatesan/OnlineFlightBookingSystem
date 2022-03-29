package com.capg.springboot.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capg.springboot.entity.Passenger;
import com.capg.springboot.repository.PassengerRepository;


@Service
@Transactional
public class PassengerServiceImplementation implements PassengerService {

	@Autowired 
	private PassengerRepository passengerRepository;
	
	@Override
	public Passenger addPassenger(Passenger add) {
		
		passengerRepository.save(add);
	return add;
	}
	
	@Override
	public Passenger removePassenger(Passenger add) {
		
		passengerRepository.delete(add);
	return add;
	}
	
	@Override
	public Passenger modifyPassenger(Passenger passenger, int passengerId) {
		Optional<Passenger> a = passengerRepository.findById(passengerId);
		if(a.isPresent()) {
			Passenger modified = a.get();
			modified.setPassengerId(passenger.getPassengerId());
			modified.setFirstName(passenger.getFirstName());
			modified.setLastName(passenger.getLastName());
			modified.setAge(passenger.getAge());
			modified.setGender(passenger.getGender());
			modified.setPassportNo(passenger.getPassportNo());
			modified.setMealPref(passenger.getMealPref());
			passengerRepository.save(modified);
			return modified;
		}
		return null;
	}

	@Override
	public Passenger updatePassenger(Passenger add) {
		// TODO Auto-generated method stub
		return null;
	}
}