package com.example.ata.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.ata.dto.VehicleDto;

@FeignClient(name="VEHICLE-MICROSERVICE", url="http://localhost:9191/api/vehicle/")
public interface VehicleClient {

	@GetMapping("/vehicle/{id}")
	public VehicleDto getVehicleById(@PathVariable int id);
}
