package com.example.identity.serviceimpl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


import com.example.identity.dto.UserRegistrationDto;
import com.example.identity.entity.UserRegistration;
import com.example.identity.modelmapper.RegistrationMapper;
import com.example.identity.repository.UserRepository;
import com.example.identity.service.AuthService;
import com.example.identity.service.JwtService;

@Service
public class AuthServiceImpl implements AuthService {

	@Autowired
	private UserRepository userRepo;

	@Autowired
	private PasswordEncoder passwordEncoder;

	boolean flag;

	
	
	@Autowired 
	private JwtService jwtService;

	


	@Override
	public String generateToken(String username) {
		// TODO Auto-generated method stub
		
		return jwtService.generateToken(username);
	}

	@Override
	public void validateToken(String token) {
		// TODO Auto-generated method stub
		jwtService.validateToken(token);
		
	}


	@Override
	public String saveUser(UserRegistrationDto userDto) {
		// TODO Auto-generated method stub
		List<UserRegistration> userList = userRepo.findAll();
		List<UserRegistrationDto> userDtoList = userList.stream().map(RegistrationMapper::mapToRegistrationDto)
				.collect(Collectors.toList());

		if (userDtoList != null) {
			for (UserRegistrationDto user : userDtoList) {
				if (user.getName().equals(userDto.getName())) {
					flag = true;
				} else {
					flag = false;
				}
			}

			if (flag) {
				return "User already exists";
			} else {
				userDto.setPassword(passwordEncoder.encode(userDto.getPassword()));
				userRepo.save(RegistrationMapper.mapToRegistration(userDto));
				return "Saved User";
			}
		}
		return "Unable to process registration";
	}

}
