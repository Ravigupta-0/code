package com.Spring.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import com.Spring.users;
import com.Spring.entity.UserEntity;



public class UserUtils {

	public static List<users> convertUserEntityListToUserList(List<UserEntity> userEntityList) {
		List<users> userList = new ArrayList<users>();
		Consumer<UserEntity> consumer = (UserEntity userEntity)->userList.add(convertUserEntityToUser(userEntity));
		userEntityList.stream().forEach(consumer);
		return userList;
	}
		
	public static users convertUserEntityToUser(UserEntity userEntity) {
		return new users(userEntity.getId(), userEntity.getUserName(), userEntity.getFirstName(), userEntity.getPassword());
	}

	public static UserEntity convertUserToUserEntity(users user) {
		return new UserEntity(user.getUserName(), user.getFirstName(), user.getPassword(), user.getPassword());
	}
}
