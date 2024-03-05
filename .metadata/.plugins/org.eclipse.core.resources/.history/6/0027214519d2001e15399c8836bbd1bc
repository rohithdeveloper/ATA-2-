package com.example.demo.registration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.registration.dto.UserRegistrationDto;
import com.example.demo.registration.model.AuthRequest;
import com.example.demo.registration.service.RegistrationService;
import com.example.demo.registration.serviceimpl.JwtService;

@RestController
@RequestMapping("/api/registration")
public class RegistrationController {
	
	@Autowired
	private RegistrationService regService;
	
	@Autowired
	private AuthenticationManager authenticationManager;
	
	@Autowired
	private JwtService jwtService;
	
	@PostMapping("/user")
	public String saveUser(@RequestBody UserRegistrationDto userRegDto) {
		return regService.save(userRegDto);
	}

	@PostMapping(value="/auth",consumes = "application/json")
	public String generateToken(@RequestBody AuthRequest authRequest) {
		Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authRequest.getUsername(), authRequest.getPassword()));
		if(authentication.isAuthenticated()) {
		//return jwtService.generateToken(authRequest.getUsername());
			String token = jwtService.generateToken(authRequest.getUsername());
	        System.out.println("Generated Token: " + token);
	        return token;
		}else {
			throw new UsernameNotFoundException("Invalid User");
			//return "Invalid User";
		}
	}
}
