package com.capg.springboot.service;

import java.util.Optional;

import com.capg.springboot.entity.Fleet;

public interface FleetService {

    Fleet addFleet(Fleet Fleet);

	Fleet modifyFleet(Fleet Fleet);

	Fleet removeFleet(Fleet Fleet);

	/*
	 * Fleet modifyFleet(Fleet Fleet, int FleetId);
	 * 
	 * Optional<Fleet> findFleetById(int fleetId);
	 * 
	 * Fleet viewFleetBy(String fleetid) throws Exception;
	 * 
	 * FleetService addFleet1(Fleet Fleet);
	 * 
	 * Fleet findFleetById(String fleetid);
	 * 
	 * Fleet save(Fleet add);
	 */

}