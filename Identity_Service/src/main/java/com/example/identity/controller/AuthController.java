package com.example.identity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.identity.dto.UserRegistrationDto;
import com.example.identity.entity.AuthRequest;
import com.example.identity.service.AuthService;

@RestController
@RequestMapping("/api/user")
public class AuthController {
	
	@Autowired
	private AuthService authService;
	
	@Autowired
	private AuthenticationManager authenticationManager;
	
	@PostMapping("/register")
	public String addNewUser(@RequestBody UserRegistrationDto userRegDto) {
		return authService.saveUser(userRegDto);
	}
	

	@PostMapping("/token")
	public String getToken(@RequestBody AuthRequest authRequest ) {
		Authentication authentication = authenticationManager.authenticate(
				new UsernamePasswordAuthenticationToken(authRequest.getUsername(), authRequest.getPassword()));
		if (authentication.isAuthenticated()) {
			return authService.generateToken(authRequest.getUsername());
		}
		else {
			throw new RuntimeException("Invalid Access");
		}
	}
	
	@GetMapping("/validate")
	public String validateToken(@RequestParam("token") String token ) {
		 authService.validateToken(token);
		 return "Token is valid";
	}
}
