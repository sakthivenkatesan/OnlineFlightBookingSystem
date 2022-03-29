//Sakthi B V
package com.capg.springboot.service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capg.springboot.entity.User;
import com.capg.springboot.exceptions.UserNotFoundException;
import com.capg.springboot.entity.User;
import com.capg.springboot.repository.UserRepository;

@Service
@Transactional
public abstract class LoginServiceImplementation implements UserRepository
{
	@Autowired
	private UserRepository userRepository;
	
	//Add User
	@Override
	public User addUser(User add) {
		
		return userRepository.save(add);
		
	}
	
	//Delete User
	@Override
	public User removeUser(User add) {
		
		userRepository.delete(add);
	return add;
	}
}
