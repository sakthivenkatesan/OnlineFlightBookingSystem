package com.capg.springboot.service;


import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.capg.springboot.entity.*;
import com.capg.springboot.exceptions.*;
import com.capg.springboot.repository.*;

@Service
@Transactional
public abstract class FleetServiceImplementation implements FleetService{
	@Autowired
	private FleetService FleetService;
	
	//Add User
	@Override
	public Fleet addFleet(Fleet add) {
		
		return FleetService.save(add);
		
	}
	
	//Modify User
	@Override
	public Fleet modifyFleet(Fleet Fleet, int FleetId) {
		Optional<Fleet> a = FleetService.findFleetById(FleetId);
		if(a.isPresent()) {
			Fleet modified = a.get();
			modified.setFleetId(Fleet.getFleetId());
            modified.setCode(Fleet.getCode());
            modified.setModel(Fleet.getModel());
            modified.setTotalEconomySeats(Fleet.getTotalEconomySeats());
            modified.setTotalPremiumSeats(Fleet.getTotalPremiumSeats());
            modified.setTotalBusinessSeats(Fleet.getTotalBusinessSeats());

			FleetService.save(modified);
			return modified;
		}
		return null;
	}
	
	//Delete User
	@Override
	public Fleet viewFleetBy(String fleetid) throws Exception {
		Fleet add=FleetService.findFleetById(fleetid);
            if(add==null)
            	throw new Exception("Fleet Not Found ");
        return add;
	}

	public Fleet save(Fleet add) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FleetService addFleet1(Fleet Fleet) {
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

}