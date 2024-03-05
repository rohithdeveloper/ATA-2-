package com.example.ata.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Booking_microservice")
public class Booking {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int bookingId;
	@Column(name="booking_date")
	private Date bookingDate;
	@Column(name="journey_date")
	private Date journeyDate;
	@Column(name="source")
	private String source;
	@Column(name="destination")
	private String destination;
	@Column(name="pickup_point")
	private String boardingpoint;
	@Column(name="drop")
	private String dropingPoint;
	@Column(name="noofpassengers")
	private int noOfPassengers;
	@Column(name="status")
	private boolean status;
	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Booking(int bookingId, Date bookingDate, Date journeyDate, String source, String destination,
			String boardingpoint, String dropingPoint, int noOfPassengers, boolean status) {
		super();
		this.bookingId = bookingId;
		this.bookingDate = bookingDate;
		this.journeyDate = journeyDate;
		this.source = source;
		this.destination = destination;
		this.boardingpoint = boardingpoint;
		this.dropingPoint = dropingPoint;
		this.noOfPassengers = noOfPassengers;
		this.status = status;
	}
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public Date getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}
	public Date getJourneyDate() {
		return journeyDate;
	}
	public void setJourneyDate(Date journeyDate) {
		this.journeyDate = journeyDate;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getBoardingpoint() {
		return boardingpoint;
	}
	public void setBoardingpoint(String boardingpoint) {
		this.boardingpoint = boardingpoint;
	}
	public String getDropingPoint() {
		return dropingPoint;
	}
	public void setDropingPoint(String dropingPoint) {
		this.dropingPoint = dropingPoint;
	}
	public int getNoOfPassengers() {
		return noOfPassengers;
	}
	public void setNoOfPassengers(int noOfPassengers) {
		this.noOfPassengers = noOfPassengers;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	

	
	
	

}
