package com.example.demo.registration.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity

@Table(name = "Registration")
public class UserRegistration {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "User_Id")
	private int userId;
	@Column(name = "User_Name")
	private String name;
	@Column(name = "User_Dob")
	private String Dob;
	@Column(name = "User_Gender")
	private String gender;
	@Column(name = "User_Address")
	private String address;
	@Column(name = "User_Mobile")
	private String mobile;
	@Column(name = "User_Email")
	private String email;
	@Column(name = "User_Password")
	private String password;
	@Column(name = "User_Role")
	private String role;
	public UserRegistration() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserRegistration(int userId, String name, String dob, String gender, String address, String mobile,
			String email, String password, String role) {
		super();
		this.userId = userId;
		this.name = name;
		Dob = dob;
		this.gender = gender;
		this.address = address;
		this.mobile = mobile;
		this.email = email;
		this.password = password;
		this.role = role;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDob() {
		return Dob;
	}
	public void setDob(String dob) {
		Dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}

}