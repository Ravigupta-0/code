package com.Spring.user_controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.Spring.users;
import com.Spring.service.UserService;

@RestController
@RequestMapping("/myapp")
public class user_Controller {

	@Autowired
	private UserService registrationService;

	@PostMapping(value="/user/registration", produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody users registerUser(@RequestBody users user) {
		return registrationService.save(user);
	}
	
	@PostMapping(value="/user/login", produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody String loginUser(@RequestBody users user) {
		return registrationService.login(user);
	}
	
	@GetMapping("/user")
	public List<users> getAllUsers() {
		return registrationService.getAllUsers();
	}

	@GetMapping("/user/{id}")
	public users getUserById(@PathVariable(value="id") String userId) {
		return registrationService.getUserById(userId);
	}

	@PutMapping(value="/user/{id}", produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody users updateUser(@RequestBody users user, @PathVariable(value="id") String id) {
		return registrationService.update(user, id);
	}
	
	@DeleteMapping(value="/user/{id}")
	public boolean deleteUser(@PathVariable(value="id") String id) {
		return registrationService.delete(id);
	}

	@PostMapping(value="/user/logout", produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody String logoutUser(@RequestHeader(name="auth-token") String authToken) {
		return registrationService.logout(authToken);
	}

}