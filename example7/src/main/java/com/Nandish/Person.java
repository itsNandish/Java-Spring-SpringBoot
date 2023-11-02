package com.Nandish;

import org.springframework.context.annotation.Primary;

import java.security.PrivateKey;

public class Person {
    private String name;
    private Vehicle vehicle;

    public String getName() {
        return name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void setName(String name) {
        this.name = name;
    }
}
