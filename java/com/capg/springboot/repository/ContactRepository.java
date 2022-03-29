package com.capg.springboot.repository;
import java.util.Optional;

import com.capg.springboot.entity.*;
import com.capg.springboot.exceptions.*;
public interface ContactRepository {
	static Contact findContactById(int customerId) {
		// TODO Auto-generated method stub
		return null;
	}

	Contact addContact(Contact add);

	Contact viewContactBy(String customerId) throws UserNotFoundException;

	Contact save(Contact add);

	Contact updateContact(Contact add);

	Contact modifyContact(Contact contact, int customerId);

	Contact viewContactBy(int customerid) throws UserNotFoundException;

	Optional<Contact> findById(int customerId);


}