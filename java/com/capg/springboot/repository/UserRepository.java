//Sakthi B V
package com.capg.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.capg.springboot.entity.User;
import com.capg.springboot.exceptions.UserNotFoundException;

public interface UserRepository extends JpaRepository<User, Integer> {


}
