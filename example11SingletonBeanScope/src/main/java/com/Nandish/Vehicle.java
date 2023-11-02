package com.Nandish;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {
    private String name="supra";
    private final VehicleServices vehicleServices;
    @Autowired
    public Vehicle(VehicleServices vehicleServices) {
        this.vehicleServices = vehicleServices;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void message(){

        System.out.println("printing message from the component spring context");
    }

    public VehicleServices getVehicleServices() {
        return vehicleServices;
    }
}
