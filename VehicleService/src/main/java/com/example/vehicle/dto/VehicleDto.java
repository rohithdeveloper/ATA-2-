package com.example.vehicle.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VehicleDto {
	private int id;
	private String vehicleName;
	private int seatingCapacity;
	private int driverId;
	private String vehicleType;
	private float farePerKm;

}
