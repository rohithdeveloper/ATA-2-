package com.example.demo.registration.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Registration")
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
	

}
