//Manoj Kumar N
package com.capg.springboot.service;

import com.capg.springboot.entity.Contact;

public interface ContactService {

	Contact addContact(Contact contact);

	Contact modifycontact(Contact contact);

	Contact removeCustomer(Contact contact);
}