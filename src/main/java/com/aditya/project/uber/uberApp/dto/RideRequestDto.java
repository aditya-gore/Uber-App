package com.aditya.project.uber.uberApp.dto;

import com.aditya.project.uber.uberApp.entities.Rider;
import com.aditya.project.uber.uberApp.entities.enums.PaymentMethod;
import com.aditya.project.uber.uberApp.entities.enums.RideRequestStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.locationtech.jts.geom.Point;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RideRequestDto {
    private Long id;

    private Point pickUpLocation;

    private Point dropOffLocation;

    private LocalDateTime requestedTime;

    private Rider rider;

    private PaymentMethod paymentMethod;

    private RideRequestStatus rideRequestStatus;
}
