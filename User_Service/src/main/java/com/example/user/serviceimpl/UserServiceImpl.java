package com.example.user.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.example.user.dto.UserDto;
import com.example.user.model.UserEntity;
import com.example.user.repository.UserRepository;
import com.example.user.service.UserService;

public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public UserDto findByUsername(String username) {
        UserEntity userEntity = userRepository.findByUsername(username);
        if (userEntity != null) {
            return entityToDto(userEntity);
        }
        return null;
    }

    @Override
    public UserDto save(UserDto userDto) {
        UserEntity userEntity = dtoToEntity(userDto);
        userEntity.setPassword(passwordEncoder.encode(userDto.getPassword())); // Password should be hashed
        userRepository.save(userEntity);
        return entityToDto(userEntity);
    }

    @Override
    public boolean authenticate(String username, String password) {
        UserEntity userEntity = userRepository.findByUsername(username);
        return userEntity != null && passwordEncoder.matches(password, userEntity.getPassword());
    }

    private UserDto entityToDto(UserEntity entity) {
        UserDto dto = new UserDto();
        dto.setUsername(entity.getUsername());
        dto.setPassword(entity.getPassword());
        dto.setRole(entity.getRole());
        return dto;
    }

    private UserEntity dtoToEntity(UserDto dto) {
        UserEntity entity = new UserEntity();
        entity.setUsername(dto.getUsername());
        entity.setPassword(dto.getPassword());
        entity.setRole(dto.getRole());
        return entity;
    }
}
