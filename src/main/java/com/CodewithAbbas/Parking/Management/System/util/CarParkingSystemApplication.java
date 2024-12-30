package com.CodewithAbbas.Parking.Management.System.util;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
public class CarParkingSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(CarParkingSystemApplication.class, args);
        System.out.println("Running.....");
    }
}
