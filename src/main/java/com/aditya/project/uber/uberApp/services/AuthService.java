package com.aditya.project.uber.uberApp.services;

import com.aditya.project.uber.uberApp.dto.DriverDto;
import com.aditya.project.uber.uberApp.dto.SignupDto;
import com.aditya.project.uber.uberApp.dto.UserDto;

public interface AuthService {
    String login(String email, String password);
    UserDto signup(SignupDto signupDto);
    DriverDto onBoardNewDriver(Long userId);
}
