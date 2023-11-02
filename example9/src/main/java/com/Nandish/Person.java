package com.Nandish;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class Person {
    private String name="Roronoa Zoro";

    private   Vehicle vehicle;
    @Autowired
    public Person( @Qualifier("vehicle2") Vehicle vehicle) {
    System.out.println("Autowired in constructor");
        this.vehicle = vehicle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
