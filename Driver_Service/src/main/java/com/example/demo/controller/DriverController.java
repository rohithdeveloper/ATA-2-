package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.DriverDto;
import com.example.demo.service.DriverService;

@RestController
@RequestMapping("/api/driver")
public class DriverController {
	
	@Autowired
	private DriverService driverService;
	
	@PostMapping("/add_driver")
	public DriverDto addDriver(@RequestBody DriverDto driverDto) {
		return driverService.save(driverDto);
		
	}
	@DeleteMapping("/delete_driver/{driverNo}")
	public String deleteDriver(@PathVariable  int driverNo) {
		return driverService.deleteDriver(driverNo);
		
	}
	@PutMapping("/updatedriver/{driverNo}")
	public String updateDriver( @PathVariable int driverNo,@RequestBody DriverDto driverDto) {
		return driverService.updateDriver(driverNo, driverDto);
		
	}
	@GetMapping("/viewdriver/{driverNo}")
	public DriverDto viewDriver(@PathVariable int driverNo) {
		return driverService.viewDriverById(driverNo);
		
	}
}
