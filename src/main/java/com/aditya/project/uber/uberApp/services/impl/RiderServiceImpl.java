package com.aditya.project.uber.uberApp.services.impl;

import com.aditya.project.uber.uberApp.dto.DriverDto;
import com.aditya.project.uber.uberApp.dto.RideDto;
import com.aditya.project.uber.uberApp.dto.RideRequestDto;
import com.aditya.project.uber.uberApp.dto.RiderDto;
import com.aditya.project.uber.uberApp.services.RiderService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RiderServiceImpl implements RiderService {
    @Override
    public RideRequestDto requestRide(RideRequestDto rideRequestDto) {
        return null;
    }

    @Override
    public RideDto cancelRide(Long rideId) {
        return null;
    }

    @Override
    public DriverDto rateDriver(Long rideId, Integer rating) {
        return null;
    }

    @Override
    public RiderDto getMyProfile() {
        return null;
    }

    @Override
    public List<RideDto> getAllMyRides() {
        return null;
    }
}
