package com.capg.springboot.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.capg.springboot.entity.*;
import com.capg.springboot.exceptions.*;
import com.capg.springboot.repository.*;


public class ContactServiceImplementation implements ContactRepository{
	@Autowired
	private ContactRepository contactRepository;
	
	//Add User
	@Override
	public Contact addContact(Contact add) {
		
		return contactRepository.save(add);
		
	}
	
	//Modify User
		@Override
		public Contact modifyContact(Contact contact, int customerId) {
			Optional<Contact> a = contactRepository.findById(customerId);
			if(a.isPresent()) {
				Contact modified = a.get();
				modified.setCustomerId(contact.getCustomerId());
				modified.setAddressLine(contact.getAddressLine());
	                  modified.setZipCode(contact.getZipCode());
	                  modified.setCity(contact.getCity());
				modified.setState(contact.getState());
				modified.setCountry(contact.getCountry());
				modified.setMobileNo(contact.getMobileNo());
				contactRepository.save(modified);
				return modified;
			}
			return null;
		}
	
	//Delete User
	@Override
	public Contact viewContactBy(int customerid) throws UserNotFoundException {
		Contact add=ContactRepository.findContactById(customerid);
            if(add==null)
            	throw new UserNotFoundException("Contact Not Found ");
        return add;
	}

	@Override
	public Contact save(Contact add) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Contact updateContact(Contact add) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Contact viewContactBy(String customerId) throws UserNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Contact> findById(int customerId) {
		// TODO Auto-generated method stub
		return null;
	}

}