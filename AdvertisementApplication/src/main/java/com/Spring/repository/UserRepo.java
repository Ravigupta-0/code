package com.Spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.Spring.entity.UserEntity;


@Component
public interface UserRepo extends JpaRepository<UserEntity, Long> 
{
	UserEntity findByUserName(String userName);

	UserEntity findBySessionId(String authToken);

	List<UserEntity> findByFirstName(String firstName);

	

}