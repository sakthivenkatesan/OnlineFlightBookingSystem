//Sakthi B V
package com.capg.springboot.repository;

import com.capg.springboot.entity.User;
import com.capg.springboot.exceptions.UserNotFoundException;

public interface UserRepository {


	static User findUserById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	User addUser(User add);

	User viewUserBy(String id) throws UserNotFoundException;

	User save(User add);

	User updateUser(User add);


}
