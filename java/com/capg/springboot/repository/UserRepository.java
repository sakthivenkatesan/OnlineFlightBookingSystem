//Sakthi B V
package com.capg.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.capg.springboot.entity.User;
import com.capg.springboot.exceptions.UserNotFoundException;

public interface UserRepository extends JpaRepository<User, Integer> {


	static User findUserById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	User addUser(User add);


	User removeUser(User add);

	User validateUser(String id) throws UserNotFoundException;

	User modifyUser(User user, int userId);

}