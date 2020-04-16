package com.Spring.service;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Spring.Advertisement;
import com.Spring.entity.AdvertisementEntity;
import com.Spring.entity.MsgEntity;
import com.Spring.entity.UserEntity;
import com.Spring.repository.AdvertiseRepo;
import com.Spring.repository.MsgRepo;
import com.Spring.repository.UserRepo;
import com.Spring.utils.AdvertisementUtils;

@Service
public class ImplementedAdvertiseService implements AdverService {

	@Autowired
	private UserRepo userRepository;
	
	@Autowired
	private AdvertiseRepo advertiseRepository;
	
	@Autowired
	private MsgRepo messageRepository;
	
	@Override
	public Object save(Advertisement advertise, String authToken) {
		UserEntity userEntity=userRepository.findBySessionId(authToken);
		if (userEntity!=null)
		{
			
			AdvertisementEntity advertiseEntity= advertiseRepository.save(AdvertisementUtils.convertAdvertiseToAdvertiseEntity(advertise));
			return AdvertisementUtils.convertAdvertiseEntityToAdvertise(advertiseEntity);
		}
		else 
		{
			//Wrong SessionId
			return "{\"result\": \"failure\",\"message\": \"Wrong Session Id\"}";
		}
	}

	@Override
	public Object update(Advertisement advertise, String authToken, String id) {
		UserEntity userEntity=userRepository.findBySessionId(authToken);
		if (userEntity!=null)
		{
			AdvertisementEntity advertiseEntity= advertiseRepository.findById(Long.valueOf(id)).get();
			if(advertiseEntity != null) 
			{
				advertiseEntity.setTitle(advertise.getTitle());
				advertiseEntity.setName(advertise.getName());
				advertiseEntity.setDescription(advertise.getDescription());
				advertiseEntity.setCategory(advertise.getCategory());
				advertiseEntity.setStatus(advertise.getStatus());
				return AdvertisementUtils.convertAdvertiseEntityToAdvertise(advertiseEntity);
			}
			else
				return "{\"result\": \"failure\",\"message\": \"Wrong Advertise Id\"}";
			
		}
		else 
		{
			//Wrong SessionId
			return "{\"result\": \"failure\",\"message\": \"Wrong Session Id\"}";
		}
	}

	@Override
	public List<Advertisement> getAdvertiseBySessionId(String authToken) {
		String userName=userRepository.findBySessionId(authToken).getFirstName();
		return AdvertisementUtils.convertAdvertiseEntityListToAdvertiseList( advertiseRepository.findByName(userName));
	}

	@Override
	public List<Advertisement> getAdvertiseByPostId(String authToken, String postId) {
		String userName=userRepository.findBySessionId(authToken).getFirstName();
		List<Advertisement> userAdvertise=AdvertisementUtils.convertAdvertiseEntityListToAdvertiseList( advertiseRepository.findByName(userName));
		List<Advertisement> requiredAdvertise=userAdvertise.stream().filter(advertisement -> postId.equals(advertisement.getPostId())).collect(Collectors.toList());
		return requiredAdvertise;
		}

	@Override
	public boolean deleteAdvertiseByPostId(String authToken, String postId) {
		String userName=userRepository.findBySessionId(authToken).getFirstName();
		List<Advertisement> userAdvertise=AdvertisementUtils.convertAdvertiseEntityListToAdvertiseList( advertiseRepository.findByName(userName));//Getting Advertise of Logged in User
		Advertisement advertise = AdvertisementUtils.convertAdvertiseEntityToAdvertise(advertiseRepository.findByPostId(postId));//Getting Specific Advertise
		if (userAdvertise.contains(advertise))
		{
			advertiseRepository.deleteByPostId(postId);
			return true;
		}
		
		return false;
	}

	@Override
	public List<Advertisement> getAllAdvertise() {
		return AdvertisementUtils.convertAdvertiseEntityListToAdvertiseList(
				advertiseRepository.findAll());
	}

	@Override
	public MsgEntity addMessage(MsgEntity message) {
		String postId=message.getPostId();
		 AdvertisementEntity advertiseEntity= advertiseRepository.findByPostId(postId);
		 List<MsgEntity> messageList=advertiseEntity.getMessageList();
		 message.setPostId(postId);
		 messageList.add(message);
		 message=messageRepository.save(message);
		 return message;
	}

}
