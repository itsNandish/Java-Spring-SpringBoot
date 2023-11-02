package com.exampleBeans;

import org.springframework.context.annotation.Bean;
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
    Vehicle vehicle1(){
        var veh=new Vehicle();
        veh.setName("Audi");
        return veh;
    }
    @Bean
    String message(){
        return "Iam here";
    }
    @Bean
    Integer number(){
        return 18;
    }

}
