package com.Nandish;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class Person {
    private String name="Roronoa Zoro";

    private  final Vehicle vehicle;
    @Autowired
    public Person(Vehicle vehicle) {
    System.out.println("Vehicle has be created");
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

}
