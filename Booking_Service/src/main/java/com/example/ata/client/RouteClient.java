package com.example.ata.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.ata.dto.RouteDto;

@FeignClient(name="ROUTE-MICROSERVICES", url="http://localhost:9191/api/route/")
public interface RouteClient {
	
	@GetMapping("/routeid/{routeId}")
	public RouteDto viewRoutesById(@PathVariable("routeId") int routeId);
	

}
