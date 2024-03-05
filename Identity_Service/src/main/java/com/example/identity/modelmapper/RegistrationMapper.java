package com.example.identity.modelmapper;

import com.example.identity.dto.UserRegistrationDto;
import com.example.identity.entity.UserRegistration;

public class RegistrationMapper {
	public static UserRegistrationDto mapToRegistrationDto(UserRegistration registration) {
		UserRegistrationDto userDto =new UserRegistrationDto();
		userDto.setUserId(registration.getUserId());
		userDto.setName(registration.getName());
		userDto.setDob(registration.getDob());
		userDto.setGender(registration.getGender());
		userDto.setAddress(registration.getAddress());
		userDto.setMobile(registration.getMobile());
		userDto.setEmail(registration.getEmail());
		userDto.setPassword(registration.getPassword());
		userDto.setRole(registration.getRole());
		return userDto;
	}
	
	public static UserRegistration mapToRegistration(UserRegistrationDto registrationDto) {
		UserRegistration user =new UserRegistration();
		user.setUserId(registrationDto.getUserId());
		user.setName(registrationDto.getName());
		user.setDob(registrationDto.getDob());
		user.setGender(registrationDto.getGender());
		user.setAddress(registrationDto.getAddress());
		user.setMobile(registrationDto.getMobile());
		user.setEmail(registrationDto.getEmail());
		user.setPassword(registrationDto.getPassword());
		user.setRole(registrationDto.getRole());
		return user;
	}

}
