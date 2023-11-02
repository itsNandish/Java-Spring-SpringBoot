package com.Nandishexample2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        var context=new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle veh1=context.getBean(Vehicle.class);
        System.out.println("vehicle name from the spring context is : " + veh1.getName());

       Vehicle veh2=context.getBean(Vehicle.class);
        System.out.println("vehicle name from the spring context is : " + veh2.getName());

        Vehicle veh3=context.getBean( Vehicle.class);
        System.out.println("vehicle name from the spring context is : " + veh3.getName());
    }
}
