//Sakthi B V
package com.capg.springboot.service;

import com.capg.springboot.dto.UserDto;
import com.capg.springboot.entity.User;

public interface UserService 
{

	User addCustomer(UserDto customer);

	User modifyCustomer(UserDto customer);

	User removeCustomer(User customer);
	
}
