package com.Spring.service;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Spring.users;
import com.Spring.entity.UserEntity;
import com.Spring.repository.UserRepo;
import com.Spring.utils.UserUtils;

@Service
public class ImplementedUserService implements UserService {

	@Autowired
	private UserRepo userRepository;
	
	public users save(users user) {
		UserEntity userEntity = 
				userRepository.save(UserUtils.convertUserToUserEntity(user));
		return UserUtils.convertUserEntityToUser(userEntity);
	}

	public List<users> getAllUsers() {
		List<UserEntity> userEntityList = userRepository.findAll();
		return UserUtils.convertUserEntityListToUserList(userEntityList);
	}

	public users getUserById(String id) {
		UserEntity userEntity = userRepository.findById(Long.valueOf(id)).get();
		return UserUtils.convertUserEntityToUser(userEntity);
	}

	@Override
	public users update(users user, String id) {
		UserEntity userEntity = userRepository.findById(Long.valueOf(id)).get();
		if(userEntity != null) {
			userEntity.setFirstName(user.getFirstName());
			userEntity.setUserName(user.getUserName());
			userEntity.setPassword(user.getPassword());
			userEntity = userRepository.save(userEntity);
			return UserUtils.convertUserEntityToUser(userEntity);
		}
		return null;
	}

	@Override
	public boolean delete(String id) {
		if(userRepository.existsById(Long.valueOf(id))) {
			userRepository.deleteById(Long.valueOf(id));
			return true;
		}
		return false;
	}

	@Override
	public String login(users user) {
		
		Random random =new Random();
		users newUser =UserUtils.convertUserEntityToUser(userRepository.findByUserName(user.getUserName()));
		
			if (newUser.getUserName().equals(user.getUserName()))
			{
		
					
					UserEntity userEntity = userRepository.findById(Long.valueOf(newUser.getId())).get();
					userEntity.setSessionId(Integer.toString(random.nextInt(10000)));
					userEntity =userRepository.save(userEntity);
					return "{\"result\": \"success\"}";
				
				
					
				
			}	
		else 
			return "{\"result\": \"invalid Password\"}";
		
	}

	@Override
	public String logout(String authToken) {
		if (authToken.equals(null))
		{
			return "{\"result\": \"Invalid Session-Id\"}";
		}
		else
		{
		UserEntity userEntity= userRepository.findBySessionId(authToken);
		userEntity.setSessionId(null);
		userEntity =userRepository.save(userEntity);
		return "{\"result\": \"Sucess\"}";
		}
	}

	@Override
	public List<users> getUsersByFirstName(String firstName) {
		// TODO Auto-generated method stub
		return null;
	}
}
