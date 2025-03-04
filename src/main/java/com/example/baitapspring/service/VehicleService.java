package com.example.baitapspring.service;


import com.example.baitapspring.domain.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehicleService {
    private final Vehicle vehicle;

    @Autowired
    public VehicleService(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void startVehicle() {
        vehicle.start();
    }

    public void stopVehicle() {
        vehicle.stop();
    }
}
