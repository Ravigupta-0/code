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
	
	@PostMapping(value="/Advertise", produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public Object  postAdvertise(@RequestBody Advertisement advertise,@RequestHeader(name="auth-token") String authToken)
	{
		return registrationService.save(advertise,authToken);
	}
	@PostMapping(value="/Advertise/{id}", produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public Object  updateAdvertise(@RequestBody Advertisement advertise,@RequestHeader(name="auth-token") String authToken,@PathVariable(value="id") String id)
	{
	  return registrationService.update(advertise,authToken,id);
	}
	@GetMapping("/Advertise/user")
	public List<Advertisement> getAdvertiseBySessionId(@RequestHeader(name="auth-token") String authToken) {
		return registrationService.getAdvertiseBySessionId(authToken);
	}
	@GetMapping("/Advertise/user/{postId}")
	public Advertisement getAdvertiseByPostId(@RequestHeader(name="auth-token") String authToken,@PathVariable(value="postId") String postId) {
		return registrationService.getAdvertiseByPostId(authToken, postId);
	}
	@DeleteMapping("/Advertise/user/{postId}")
	public boolean deleteAdvertiseByPostId(@RequestHeader(name="auth-token") String authToken,@PathVariable(value="postId") String postId) {
		return registrationService.deleteAdvertiseByPostId(authToken,postId);
	}
	
	@GetMapping("/Advertise/postedBy/{name}")
	public List<Advertisement> getAdvertiseByName(@PathVariable(value="name") String name)
	{
		return registrationService.getAdvertiseByName(name);
	}
	
	@GetMapping("/AdvertiseList")
	public List<Advertisement> getAllAdvertise()
	{
		return registrationService.getAllAdvertise();
	}
	
	@PostMapping(value="Advertise/addMessage", produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public MsgEntity addMessage(@RequestBody MsgEntity message )
	{
		return registrationService.addMessage(message);
	}
	
	
}
