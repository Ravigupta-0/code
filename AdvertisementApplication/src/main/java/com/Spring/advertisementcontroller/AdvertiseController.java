package com.Spring.advertisementcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Spring.Advertisement;
import com.Spring.entity.MsgEntity;
import com.Spring.service.AdverService;

@RestController
@RequestMapping("/myapp")
public class AdvertiseController 
{
	@Autowired
	private AdverService registrationService;
	
	@PostMapping(value="/Advertisement", produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public Object  postAdvertisement(@RequestBody Advertisement advertise,@RequestHeader(name="auth-token") String authToken)
	{
		return registrationService.save(advertise,authToken);
	}
	@PostMapping(value="/Advertisement/{id}", produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public Object  updateAdvertisement(@RequestBody Advertisement advertise,@RequestHeader(name="auth-token") String authToken,@PathVariable(value="id") String id)
	{
	  return registrationService.update(advertise,authToken,id);
	}
	@GetMapping("/Advertisement/user")
	public List<Advertisement> getAdvertiseBySessionId(@RequestHeader(name="auth-token") String authToken) {
		return registrationService.getAdvertiseBySessionId(authToken);
	}
	
	@DeleteMapping("/Advertisement/user/{postId}")
	public boolean deleteAdvertiseByPostId(@RequestHeader(name="auth-token") String authToken,@PathVariable(value="postId") String postId) {
		return registrationService.deleteAdvertiseByPostId(authToken,postId);
	}
	
	@GetMapping("/AdvertisementList")
	public List<Advertisement> getAllAdvertise()
	{
		return registrationService.getAllAdvertise();
	}
	
	@PostMapping(value="Advertisement/addMessage", produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public MsgEntity addMessage(@RequestBody MsgEntity message )
	{
		return registrationService.addMessage(message);
	}
	
	
}
