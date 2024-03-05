package com.example.ata.dto;

import java.util.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookingDto {
	private int bookingId;
	private Date bookingDate;
	private Date journeyDate;
	private String source;
	private String destination;
	private String boardingpoint;
	private String dropingPoint;
	private int noOfPassengers;
	private boolean status;
	private RouteDto routeDto;
	private DriverDto driverDto;
	private VehicleDto vehicleDto;
	
	
	
	
}
