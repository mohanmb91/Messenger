package com.messenger.miracle.com.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


@Entity
public class User implements Serializable{
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	String name;
	String password;
	String emailId;
	@ManyToMany(cascade = CascadeType.ALL)
	List<ContactRequest> contactRequests;
	@ManyToMany(cascade = CascadeType.ALL)
	List<Message> messages;
	
	public List<ContactRequest> getContactRequests() {
		return contactRequests;
	}
	public void setContactRequests(List<ContactRequest> contactRequests) {
		this.contactRequests = contactRequests;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
