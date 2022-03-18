//Manoj Kumar N
package com.capg.springboot.service;

import com.capg.springboot.dto.ContactDto;
import com.capg.springboot.entity.Contact;

public interface ContactService {

	Contact addContact(ContactDto contact);

	Contact modifycontact(ContactDto contact);

	Contact removeCustomer(ContactDto contact);
}