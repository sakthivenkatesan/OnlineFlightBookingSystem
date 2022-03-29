//Anantha Krishnan V S
package com.capg.springboot.service;

import com.capg.springboot.entity.Location;

public interface LocationService {

	Location addCustomer(Location customer);

	Location modifyCustomer(Location customer);

	Location removeCustomer(Location customer);

}