package com.example.baitapspring;

import com.example.baitapspring.service.VehicleService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BaiTapSpringApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(BaiTapSpringApplication.class, args);

        VehicleService vehicleService = context.getBean(VehicleService.class);
        vehicleService.startVehicle();
        System.out.println("=====================================");
        vehicleService.stopVehicle();

    }

}
