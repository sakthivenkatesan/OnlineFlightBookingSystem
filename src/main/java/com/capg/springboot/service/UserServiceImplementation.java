//Sakthi B V
package com.capg.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capg.springboot.entity.User;
import com.capg.springboot.exceptions.UserNotFoundException;
import com.capg.springboot.entity.User;
import com.capg.springboot.repository.UserRepository;

@Service
@Transactional
public class UserServiceImplementation implements UserRepository
{
	@Autowired
	private UserRepository userRepository;
	
	//Add User
	@Override
	public User addUser(User add) {
		
		return userRepository.save(add);
		
	}
	
	//Modify User
	@Override
	public User updateUser(User add) {
		userRepository.save(add);
		return add;
	}
	
	//Delete User
	@Override
	public User viewUserBy(String id) throws UserNotFoundException {
		User add=UserRepository.findUserById(id);
            if(add==null)
            	throw new UserNotFoundException("User Not Found ");
        return add;
	}

	@Override
	public User save(User add) {
		// TODO Auto-generated method stub
		return null;
	}
}
