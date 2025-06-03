package com.aditya.project.uber.uberApp.strategies;

import com.aditya.project.uber.uberApp.dto.RideRequestDto;
import com.aditya.project.uber.uberApp.entities.Driver;

import java.util.List;

public interface DriverMatchingStrategy {
    List<Driver> findMatchingDriver(RideRequestDto rideRequestDto);
}
