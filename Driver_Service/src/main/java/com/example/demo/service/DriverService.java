package com.example.demo.service;

import com.example.demo.dto.DriverDto;

public interface DriverService {
	DriverDto save(DriverDto driverDto);

	String updateDriver(int driverNo, DriverDto driverDto);

	String deleteDriver(int driverNo);

	DriverDto viewDriverById(int driverNo);

}
