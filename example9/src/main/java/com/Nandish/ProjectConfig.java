package com.Nandish;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/*
spring configuration annotation is part of spring core framework spring
 configuration annotation indicates that the class @bean definition methods.
 so spring container can process the class and generate spring beans
 to be used in application
 */
@Configuration
@ComponentScan("com.Nandish")
public class ProjectConfig {
    @Bean
    Vehicle vehicle1(){
        var veh=new Vehicle();
        veh.setName("supra");
        return veh;
    }
    @Bean
    Vehicle vehicle2(){
        var veh=new Vehicle();
        veh.setName("Audi");
        return veh;
    }
    @Primary
    @Bean
    Vehicle vehicle3(){
        var veh=new Vehicle();
        veh.setName("benz");
        return veh;
    }

}
