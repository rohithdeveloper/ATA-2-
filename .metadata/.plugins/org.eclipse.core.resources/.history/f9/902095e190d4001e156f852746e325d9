package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="address")
public class Address {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(name="lane1")
	private String landMark;
	
	@Column(name="state")
	private String state;
	
	@Column(name="district")
	private String district;
	
	@Column(name="pincode")
	private String zip;

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(Long id, String landMark, String state, String district, String zip) {
		super();
		this.id = id;
		this.landMark = landMark;
		this.state = state;
		this.district = district;
		this.zip = zip;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLandMark() {
		return landMark;
	}

	public void setLandMark(String landMark) {
		this.landMark = landMark;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", landMark=" + landMark + ", state=" + state + ", district=" + district + ", zip="
				+ zip + "]";
	}

	
	
	}

