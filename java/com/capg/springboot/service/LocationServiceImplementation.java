package com.capg.springboot.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capg.springboot.entity.Location;
import com.capg.springboot.exceptions.LocationNotFoundException;
import com.capg.springboot.entity.Location;
import com.capg.springboot.repository.LocationRepository;

@Service
@Transactional
public abstract class LocationServiceImplementation implements LocationRepository
{
	@Autowired
	private LocationRepository locationRepository;
	
	//Add Location
	@Override
	public Location addLocation(Location add) {
		
		return LocationRepository.save(add);
		
	}
	//Modify Location
	@Override
	public Location modifyLocation(Location location, int locationId) {
		Optional<Location> a = locationRepository.findById(locationId);
		if(a.isPresent()) {
			Location modified = a.get();
			modified.setLocationId(location.getLocationId());
			modified.setName(location.getName());
                  modified.setCode(location.getCode());
                  modified.setCountry(location.getCountry());
                  modified.setAirportName(location.getAirportName());
      			LocationRepository.save(modified);
			return modified;
		}
		return null;
	}
		
		//Delete Location
		@Override
		public Location viewLocationBy(String id) throws LocationNotFoundException {
			Location add=LocationRepository.findLOcationById(id);
	            if(add==null)
	            	throw new LocationNotFoundException("Location Not Found ");
	        return add;
		}
       public Location save(Location add) {
			// TODO Auto-generated method stub
			return null;
		}
}