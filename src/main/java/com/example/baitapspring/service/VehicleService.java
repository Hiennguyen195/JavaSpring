package com.example.baitapspring;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class VehicleService {
    private final Vehicle vehicle;

    @Autowired
    public VehicleService(@Qualifier("bike") Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void startVehicle() {
        vehicle.start();
    }

    public void stopVehicle() {
        vehicle.stop();
    }
}
