package com.example.demo.registration.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Component;

import com.example.demo.registration.configuration.UserRegUserDetails;
import com.example.demo.registration.exception.UserNotFoundException;
import com.example.demo.registration.model.UserRegistration;
import com.example.demo.registration.repository.UserRepository;

@Component
public class UserInfoUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository repository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UserNotFoundException {
        Optional<UserRegistration> userInfoOptional = repository.findByName(username);

        return userInfoOptional
                .map(UserRegUserDetails::new)
                .orElseThrow(() -> new UserNotFoundException("User not found: " + username));
    }	
}
