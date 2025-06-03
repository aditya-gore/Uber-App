package com.aditya.project.uber.uberApp.strategies;

import com.aditya.project.uber.uberApp.dto.RideRequestDto;

public interface RideFareCalculationStrategy {
    double calculateFare(RideRequestDto rideRequestDto);
}
