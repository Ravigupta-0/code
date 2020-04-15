package com.Spring.service;

import java.util.List;

import com.Spring.users;



public interface UserService {
	public List<users> getAllUsers();
	
	public users getUserById(String id);
	
	public List<users> getUsersByFirstName(String firstName);
	
	public users save(users user);
	
	public users update(users user, String id);
	
	public boolean delete(String id);

	public String login(users user);

	public String logout(String authToken);
}
