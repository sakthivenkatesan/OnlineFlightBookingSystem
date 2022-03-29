package com.capg.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.capg.springboot.entity.Contact;
import com.capg.springboot.repository.ContactRepository;


public class ContactServiceImplementation implements ContactService{
	@Autowired
	private ContactRepository contactRepository;
	
	//Add User
	@Override
	public Contact addContact(Contact add) {
		
		return contactRepository.save(add);
		
	}
	
	/*//Modify User
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
	}*/

}