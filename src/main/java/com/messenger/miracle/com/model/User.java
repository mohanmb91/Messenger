package com.messenger.miracle.com.model;

import java.util.List;

public class User {
	int id;
	String firstName;
	String lastName;
	String password;
	String emailId;
	List<ContactRequest> contactRequests;
	List<Message> messages;
	
	public List<ContactRequest> getContactRequests() {
		return contactRequests;
	}
	public void setContactRequests(List<ContactRequest> contactRequests) {
		this.contactRequests = contactRequests;
	}
	public List<Message> getMessages() {
		return messages;
	}
	public void setMessages(List<Message> messages) {
		this.messages = messages;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
}
