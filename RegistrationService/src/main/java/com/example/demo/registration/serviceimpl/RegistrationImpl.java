package com.example.demo.registration.serviceimpl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.registration.dto.UserRegistrationDto;
import com.example.demo.registration.modelmapper.RegistrationMapper;
import com.example.demo.registration.repository.UserRepository;
import com.example.demo.registration.service.RegistrationService;

@Service
public class RegistrationImpl implements RegistrationService {
    @Autowired
    private UserRepository repository;

    @Autowired
    private PasswordEncoder passwordEncoder;

   
    @Override
    public String save(UserRegistrationDto userDto) {
        List<UserRegistrationDto> userDtoList = repository.findAll().stream()
                .map(RegistrationMapper::mapToRegistrationDto)
                .collect(Collectors.toList());

        if (userDtoList.stream().anyMatch(user -> user.getName().equals(userDto.getName()))) {
            return "User already exists";
        } else {
            userDto.setPassword(passwordEncoder.encode(userDto.getPassword()));
            repository.save(RegistrationMapper.mapToRegistration(userDto));
            return "Saved User";
        }
    }



   
}




