package com.example.ata.exception;

import java.util.Date;

public class BookingException {

	private Date timestamp;
	
	private String message;
	
	private String details;

	

	public BookingException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BookingException(Date timestamp, String message, String details) {
		super();
		this.timestamp = timestamp;
		this.message = message;
		this.details = details;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public String getMessage() {
		return message;
	}

	public String getDetails() {
		return details;
	}
	
	
	
}
