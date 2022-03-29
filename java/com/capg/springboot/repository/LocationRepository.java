package com.capg.springboot.repository;

import java.util.Optional;

import com.capg.springboot.entity.Location;
import com.capg.springboot.exceptions.LocationNotFoundException;

public interface LocationRepository {

	public static  Location save(Location add) {
		// TODO Auto-generated method stub
		return null;
	}

	Location addLocation(Location add);

	Location viewLocationBy(String id) throws LocationNotFoundException;

	Location updateLocation(Location add);
	public static Location findLOcationById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	Location modifyLocation(Location location, int locationId);

	Optional<Location> findById(int locationId);

}