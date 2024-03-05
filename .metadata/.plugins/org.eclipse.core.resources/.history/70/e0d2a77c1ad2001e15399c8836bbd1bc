package com.example.vehicle.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.vehicle.dto.VehicleDto;
import com.example.vehicle.service.VehicleService;

@RestController
@RequestMapping("/api/vehicle")
public class VehicleController {
	
	@Autowired
	private VehicleService vehicleService;
	
	@PostMapping("/addVehicle")
	public String saveVehicle( @RequestBody VehicleDto vehicleDto) {
		return vehicleService.addVehicle( vehicleDto);
	}
	
	@GetMapping("/vehicle/{id}")
	public VehicleDto getVehicleById(@PathVariable int id) {
		return vehicleService.viewVehicleById(id);
	}
	
	@GetMapping("/allVehicles")
	public List<VehicleDto> getAllVehicles() {
		List<VehicleDto> vehicles=  vehicleService.viewAll();
		return vehicles;
	}
	
	@PutMapping("/vehicle/{id}")
	public String updateVehicle(@PathVariable int id, @RequestBody VehicleDto vehicleDto) {
		return vehicleService.modifyVehicleById(id, vehicleDto);
	}
	
	@DeleteMapping("/vehicle/{id}")
	public String updateVehicle(@PathVariable int id ) {
		return vehicleService.deleteVehicle(id);
	} 

}
