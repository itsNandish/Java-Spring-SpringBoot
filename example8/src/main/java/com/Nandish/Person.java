package com.Nandish;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;


@Component
public class Person {
    private String name="Monkey.D.Luffy";
    /*
    we have 3methods for AutoWiring one is mention @Autowired on the top of
    vehicle field inside person class

    Method-2 is mentioning @Autowired on the top of setter method of vehicle we can
    also mention above the getter method but its not good it will show warning like
    Autowired annotation should only be used on methods with parameters

    Method-3 is mentioning @Autowired on the top of constructor
     */
    private final   Vehicle vehicle;
@Autowired
    public Person(Vehicle vehicle) {
    System.out.println("Autowired in constructor");
        this.vehicle = vehicle;
    }

    public String getName() {
        return name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }


    public void setName(String name) {

        this.name = name;
    }
}
