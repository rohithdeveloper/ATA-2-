package com.example.vehicle.model;

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
@Table(name="Vehicle")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Vehicle {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="vehicleNo")
	private int id;
	@Column(name="vehicleName")
	private String vehicleName;
	@Column(name="seatingCapacity")
	private int seatingCapacity;
	@Column(name="driverId")
	private int driverId;
	@Column(name="vehicleType")
	private String vehicleType;
	@Column(name="farePerKm")
	private float farePerKm;
	

}
