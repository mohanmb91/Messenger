package com.messenger.miracle.com.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.messenger.miracle.com.model.User;


@RestController
@RequestMapping("api/")
public class UserController {
	@RequestMapping(value= "users/{id}", method = RequestMethod.GET)
	public User getUser(@PathVariable int id){
		// write logic to get user by ID
		User user1 = new User();
		user1.setFirstName("Mohan");
		user1.setLastName("Balasubramani");
		return user1;
	}
	@RequestMapping(value= "users", method = RequestMethod.POST)
	public User createUser(@RequestBody User user){
		// create user here using ORM
		User user1 = new User();
		user1.setFirstName("Mohan");
		user1.setLastName("Balasubramani");
		return user1;
	}
	@RequestMapping(value= "users/{id}", method = RequestMethod.PUT)
	public User updateUser(@PathVariable int id, @RequestBody User user){
		// update user by ID
		User user1 = new User();
		user1.setFirstName("Mohan");
		user1.setLastName("Balasubramani");
		return user1;
	}
	@RequestMapping(value= "users/{id}", method = RequestMethod.DELETE)
	public void deleteUser(@PathVariable int id){
		// write logic to delete user by ID
		
	}
}
