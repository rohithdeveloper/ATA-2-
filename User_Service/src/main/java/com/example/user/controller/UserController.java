package com.example.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.user.dto.UserDto;
import com.example.user.jwtutil.JwtTokenUtil;
import com.example.user.model.AuthRequest;
import com.example.user.service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestBody UserDto userDto) {
        try {
            // Assuming userDto includes at least username, password, and role
            UserDto savedUser = userService.save(userDto);
            return ResponseEntity.ok("User registered successfully!");
        } catch (Exception e) {
            // Handle registration failure, for example, duplicate username
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Registration failed: " + e.getMessage());
        }
    }

    @PostMapping("/authenticate")
    public ResponseEntity<String> authenticateUser(@RequestBody AuthRequest authRequest) {
        String username = authRequest.getUsername();
        String password = authRequest.getPassword();

        try {
            if (userService.authenticate(username, password)) {
                // Authentication successful, generate JWT token
                UserDto userDto = userService.findByUsername(username);
                String token = jwtTokenUtil.generateToken(username, userDto.getRole());
                return ResponseEntity.ok(token);
            } else {
                // Authentication failed
                return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials");
            }
        } catch (Exception e) {
            // Handle authentication failure
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Authentication failed: " + e.getMessage());
        }
    }
}