package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Driver_microservice")
public class Driver {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int driverNo;
	@Column
	private String name;
	@Column
	private String address;
	@Column
	private Long contactNo;
	@Column
	private String licenseNo;
	public Driver(int driverNo, String name, String address, Long contactNo, String licenseNo) {
		super();
		this.driverNo = driverNo;
		this.name = name;
		this.address = address;
		this.contactNo = contactNo;
		this.licenseNo = licenseNo;
	}
	public Driver() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getDriverNo() {
		return driverNo;
	}
	public void setDriverNo(int driverNo) {
		this.driverNo = driverNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Long getContactNo() {
		return contactNo;
	}
	public void setContactNo(Long contactNo) {
		this.contactNo = contactNo;
	}
	public String getLicenseNo() {
		return licenseNo;
	}
	public void setLicenseNo(String licenseNo) {
		this.licenseNo = licenseNo;
	}
	
	
}
