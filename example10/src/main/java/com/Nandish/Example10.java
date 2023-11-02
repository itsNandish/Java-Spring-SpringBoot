package com.Nandish;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class Example10 {
    public static void main(String[] args) {

        var context=new AnnotationConfigApplicationContext(ProjectConfig.class);
       String[] persons=context.getBeanNamesForType(Person.class);
       Person person=context.getBean(Person.class);
       String[] names=context.getBeanNamesForType(Vehicle.class);
//       Vehicle vehicle=context.getBean(Vehicle.class);
//       vehicle.getVehicleServices().moveVehicle();
//       vehicle.getVehicleServices().playMusic();

        person.getVehicle().getVehicleServices().playMusic();
        person.getVehicle().getVehicleServices().playMusic();


    }
}
