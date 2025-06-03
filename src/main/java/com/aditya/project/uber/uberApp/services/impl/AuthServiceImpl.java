package com.aditya.project.uber.uberApp.services.impl;

import com.aditya.project.uber.uberApp.dto.DriverDto;
import com.aditya.project.uber.uberApp.dto.SignupDto;
import com.aditya.project.uber.uberApp.dto.UserDto;
import com.aditya.project.uber.uberApp.services.AuthService;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl  implements AuthService {
    @Override
    public String login(String email, String password) {
        return "";
    }

    @Override
    public UserDto signup(SignupDto signupDto) {
        return null;
    }

    @Override
    public DriverDto onBoardNewDriver(Long userId) {
        return null;
    }
}
