package com.messenger.miracle.com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.messenger.miracle.com.model.ContactRequest;
import com.messenger.miracle.com.model.User;

@RestController
@RequestMapping("api/")
public class ContactController {
	@RequestMapping(value= "contactList/{userId}", method = RequestMethod.GET)
	public List<ContactRequest> getUserContacts(@PathVariable int userId){
		List<ContactRequest> contactList = new ArrayList<ContactRequest>();
		// write logic to get contacts by userID
		return contactList;
	}
	
	@RequestMapping(value= "sentContactRequest", method = RequestMethod.GET)
	public List<ContactRequest> sentContactRequest(@RequestBody User userFrom, @RequestBody User userTo){
		List<ContactRequest> contactList = new ArrayList<ContactRequest>();
		// write logic to get contacts by userID
		return contactList;
	}
}
