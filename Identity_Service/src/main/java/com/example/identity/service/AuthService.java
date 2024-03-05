package com.example.identity.service;

import com.example.identity.dto.UserRegistrationDto;

public interface AuthService {
	
	 String saveUser(UserRegistrationDto userDto);
	 String generateToken(String username);
	 void validateToken(String token);
}
