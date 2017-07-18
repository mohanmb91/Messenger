package com.messenger.miracle.com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.messenger.miracle.com.model.User;

@RestController
@RequestMapping("api/")
public class MessengerController {
	@RequestMapping(value= "getUnReadMessages", method = RequestMethod.GET)
	public User getUnReadMessages(@RequestBody User user){
		// get User messages by id where status is UNREAD
		User user1 = new User();
		user1.setFirstName("Mohan");
		user1.setLastName("Balasubramani");
		return user1;
	}
	@RequestMapping(value= "getReadMessages", method = RequestMethod.GET)
	public User getReadMessages(@RequestBody User user){
		// get User messages by id where status is READ
		User user1 = new User();
		user1.setFirstName("Mohan");
		user1.setLastName("Balasubramani");
		return user1;
	}
	@RequestMapping(value= "getSentMessages", method = RequestMethod.GET)
	public User getSentMessages(@RequestBody User user){
		// get User messages by id where status is SENT
		User user1 = new User();
		user1.setFirstName("Mohan");
		user1.setLastName("Balasubramani");
		return user1;
	}
}
