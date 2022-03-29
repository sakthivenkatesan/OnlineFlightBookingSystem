package com.capg.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.springboot.entity.Fleet;
import com.capg.springboot.exceptions.FleetNotFoundException;

public interface FleetRepository extends JpaRepository<Fleet, Integer> {


	static Fleet findUserById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	Fleet addFleet(Fleet add);


	Fleet removeUser(Fleet add);

	Fleet validateUser(String id) throws FleetNotFoundException;

	Fleet modifyUser(Fleet user, int userId);

}
