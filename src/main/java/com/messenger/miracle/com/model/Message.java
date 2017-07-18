package com.messenger.miracle.com.model;


public class Message {
	User from;
	User to;
	MessageStatus messageStatus;
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
	public MessageStatus getMessageStatus() {
		return messageStatus;
	}
	public void setMessageStatus(MessageStatus messageStatus) {
		this.messageStatus = messageStatus;
	}
	
	
}
