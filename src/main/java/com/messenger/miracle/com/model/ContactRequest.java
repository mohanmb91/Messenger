package com.messenger.miracle.com.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class ContactRequest implements Serializable{
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	@OneToOne
	User from;
	@OneToOne
	User to;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public User getFrom() {
		return from;
	}
	public void setFrom(User from) {
		this.from = from;
	}
	public User getTo() {
		return to;
	}
	public void setTo(User to) {
		this.to = to;
	}
	@Enumerated(EnumType.STRING)
	public ContactStatus getContactStatus() {
		return contactStatus;
	}
	public void setContactStatus(ContactStatus contactStatus) {
		this.contactStatus = contactStatus;
	}
	
	ContactStatus contactStatus;
}
