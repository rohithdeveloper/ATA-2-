package com.example.demo.registration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.registration.dto.UserRegistrationDto;
import com.example.demo.registration.service.RegistrationService;

@RestController
@RequestMapping("/api/registration")
public class RegistrationController {
	
	@Autowired
	private RegistrationService regService;
	
	@PostMapping("/user")
	public String saveUser(@RequestBody UserRegistrationDto userRegDto) {
		return regService.save(userRegDto);
	}

}
