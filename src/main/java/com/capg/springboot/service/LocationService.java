//Anantha Krishnan V S
package com.capg.springboot.service;

import com.capg.springboot.dto.LocationDto;
import com.capg.springboot.entity.Location;

public interface LocationService {

	Location addCustomer(LocationDto customer);

	Location modifyCustomer(LocationDto customer);

	Location removeCustomer(Location customer);

}