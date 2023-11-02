package com.Nandish;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/*
spring configuration annotation is part of spring core framework spring
 configuration annotation indicates that the class @bean definition methods.
 so spring container can process the class and generate spring beans
 to be used in application
 */
@Configuration
public class ProjectConfig {
    @Bean
   public Vehicle vehicle(){
        Vehicle vehicle=new Vehicle();
        vehicle.setName("supra");
        return vehicle;
    }

    /*
    here in the code we are trying to wire or establish a relation b/w person and vehicle
    by invoking the vehicle() bean method from person() bean method

    spring will make sure to have only 1 vehicle bean is created and also vehicle bean will
    be created first always as person been has dependency on it
     */


    //Method-1 using Wiring beans using method call
//    @Bean
//    public Person person(){
//       Person person=new Person();
//       person.setName("Ronaldo");
//       person.setVehicle(vehicle());
//       return person;
//    }


    //Method-2 wiring using beans Method parameters
    @Bean
    public Person person(Vehicle vehicle){
        Person person2=new Person();
        person2.setName("Messi");
        person2.setVehicle(vehicle);
        return person2;
    }

}
