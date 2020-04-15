package com.Spring.service;

import java.util.List;

import com.Spring.Advertisement;
import com.Spring.users;
import com.Spring.entity.MsgEntity;

public interface AdverService {
	Object save(Advertisement advertise, String authToken);

	Object update(Advertisement advertise, String authToken,String id);

	List<Advertisement> getAdvertiseBySessionId(String authToken);

	List<Advertisement> getAdvertiseByPostId(String authToken, String postId);

	boolean deleteAdvertiseByPostId(String authToken, String postId);
	
	List<Advertisement> getAdvertiseByName(String name);

	List<Advertisement> getAllAdvertise();


	MsgEntity addMessage(MsgEntity message );

	 

}
