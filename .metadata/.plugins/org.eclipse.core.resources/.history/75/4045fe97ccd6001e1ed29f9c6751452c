package com.example.demo.registration.serviceimpl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.registration.dto.UserRegistrationDto;
import com.example.demo.registration.model.UserRegistration;
import com.example.demo.registration.modelmapper.RegistrationMapper;
import com.example.demo.registration.repository.UserRepository;
import com.example.demo.registration.service.RegistrationService;

@Service
public class RegistrationImpl implements RegistrationService {
    @Autowired
    private UserRepository repository;
    
    @Autowired
    private PasswordEncoder passwordEncoder;

    boolean flag;

    @Override
    public String save(UserRegistrationDto userDto) {

        List<UserRegistration> userList = repository.findAll();
        List<UserRegistrationDto> userDtoList = userList.stream()
                .map(RegistrationMapper::mapToRegistrationDto)
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
                repository.save(RegistrationMapper.mapToRegistration(userDto));
                return "Saved User";
            }
        }
        return "Unable to process registration";
    }
}



//UserRegistration existingUser = repository.findByName(userDto.getName()).get();
//if (existingUser != null) {
//    throw new UserNotFoundException("User already exists with name :" + userDto.getName());
//	//return "User already exists with name :" + existingUser.getName();
//} else {
//    // convert dto to entity
//    UserRegistration userReg = RegistrationMapper.mapToRegistration(userDto);
//    UserRegistration saveUserReg = repository.save(userReg);
//
//    // convert entity to dto
//    UserRegistrationDto userRegDto = RegistrationMapper.mapToRegistrationDto(saveUserReg);
//    return "User registered successfully";
//}
//}
//