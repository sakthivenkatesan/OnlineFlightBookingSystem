package com.capg.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.springboot.entity.Fleet;

@Service
public class FleetServiceImplementation implements FleetService {
	
	@Autowired
	FleetService FleetService;

	@Override
	public Fleet addFleet(Fleet Fleet) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Fleet modifyFleet(Fleet Fleet) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Fleet removeFleet(Fleet Fleet) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * @Override public Fleet modifyFleet(Fleet Fleet, int FleetId) { // TODO
	 * Auto-generated method stub return null; }
	 * 
	 * @Override public Optional<Fleet> findFleetById(int fleetId) { // TODO
	 * Auto-generated method stub return null; }
	 * 
	 * @Override public Fleet viewFleetBy(String fleetid) throws Exception { // TODO
	 * Auto-generated method stub return null; }
	 * 
	 * @Override public com.capg.springboot.service.FleetService addFleet1(Fleet
	 * Fleet) { // TODO Auto-generated method stub return null; }
	 * 
	 * @Override public Fleet findFleetById(String fleetid) { // TODO Auto-generated
	 * method stub return null; }
	 * 
	 * @Override public Fleet save(Fleet add) { // TODO Auto-generated method stub
	 * return null; }
	 */

	/*
	 * //Add User
	 * 
	 * @Override public Fleet addFleet(Fleet add) {
	 * 
	 * return FleetService.save(add);
	 * 
	 * }
	 * 
	 * //Modify User
	 * 
	 * @Override public Fleet modifyFleet(Fleet Fleet, int FleetId) {
	 * Optional<Fleet> a = FleetService.findFleetById(FleetId); if(a.isPresent()) {
	 * Fleet modified = a.get(); modified.setFleetId(Fleet.getFleetId());
	 * modified.setCode(Fleet.getCode()); modified.setModel(Fleet.getModel());
	 * modified.setTotalEconomySeats(Fleet.getTotalEconomySeats());
	 * modified.setTotalPremiumSeats(Fleet.getTotalPremiumSeats());
	 * modified.setTotalBusinessSeats(Fleet.getTotalBusinessSeats());
	 * 
	 * FleetService.save(modified); return modified; } return null; }
	 * 
	 * //Delete User
	 * 
	 * @Override public Fleet viewFleetBy(String fleetid) throws Exception { Fleet
	 * add=FleetService.findFleetById(fleetid); if(add==null) throw new
	 * Exception("Fleet Not Found "); return add; }
	 * 
	 * public Fleet save(Fleet add) { // TODO Auto-generated method stub return
	 * null; }
	 * 
	 * 
	 * @Override public FleetService addFleet1(Fleet Fleet) { // TODO Auto-generated
	 * method stub return null; }
	 * 
	 * @Override public Fleet modifyFleet(Fleet Fleet) { // TODO Auto-generated
	 * method stub return null; }
	 * 
	 * 
	 * @Override public Fleet removeFleet(Fleet Fleet) { // TODO Auto-generated
	 * method stub return null; }
	 * 
	 * @Override public Optional<Fleet> findFleetById(int fleetId) { // TODO
	 * Auto-generated method stub return null; }
	 * 
	 * @Override public Fleet findFleetById(String fleetid) { // TODO Auto-generated
	 * method stub return null; }
	 */

}