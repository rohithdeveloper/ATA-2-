package com.example.user.service;

import com.example.user.dto.UserDto;

public interface UserService {
	UserDto findByUsername(String username);

    UserDto save(UserDto userDto);

    boolean authenticate(String username, String password);

}
