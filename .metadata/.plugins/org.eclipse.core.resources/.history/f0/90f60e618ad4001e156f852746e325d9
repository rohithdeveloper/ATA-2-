package com.example.demo.registration.modelmapper;

import com.example.demo.registration.dto.UserRegistrationDto;
import com.example.demo.registration.model.UserRegistration;

public class RegistrationMapper {
	public static UserRegistrationDto mapToRegistrationDto(UserRegistration registration) {
		UserRegistrationDto userDto =new UserRegistrationDto();
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
