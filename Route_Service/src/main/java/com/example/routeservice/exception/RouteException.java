package com.example.routeservice.exception;

import java.util.Date;

public class RouteException {

	private Date timestamp;
	
	private String message;
	
	private String details;

	

	public RouteException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RouteException(Date timestamp, String message, String details) {
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
