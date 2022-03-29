//Sakthi B V
package com.capg.springboot.service;

import com.capg.springboot.entity.User;

public interface UserService 
{
	User addUser(User customer);

	User modifyCustomer(User customer);

	User removeCustomer(User customer);

	Object getAllCustomers();

	User deleteUser(Integer customerId);
	
}
