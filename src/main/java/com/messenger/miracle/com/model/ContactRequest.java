package com.messenger.miracle.com.model;

public class ContactRequest {
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
	//@Enumerated(EnumType.STRING)
	public ContactStatus getContactStatus() {
		return contactStatus;
	}
	public void setContactStatus(ContactStatus contactStatus) {
		this.contactStatus = contactStatus;
	}
	int id;
	User from;
	User to;
	ContactStatus contactStatus;
}
