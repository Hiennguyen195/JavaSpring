package com.example.baitapspring.model;

import com.example.baitapspring.domain.Vehicle;
import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle {

    @Override
    public void start() {
        System.out.println("Car is starting");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping");
    }
}
