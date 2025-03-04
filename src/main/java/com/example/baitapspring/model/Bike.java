package com.example.baitapspring.model;

import com.example.baitapspring.domain.Vehicle;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Bike implements Vehicle {

    @Override
    public void start() {
        System.out.println("Bike is starting");
    }

    @Override
    public void stop() {
        System.out.println("Bike is stopping");
    }
}
