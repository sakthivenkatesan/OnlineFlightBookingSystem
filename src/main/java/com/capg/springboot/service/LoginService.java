package com.capg.springboot.service;

import com.capg.springboot.entity.User;

public interface LoginService 
{
	public User addUser(User user);
	public User removeUser(User user);
}
