package com.exampleBeans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example1 {
    public static void main(String[] args) {
        /*
        created vehicle object Without using beans
         */
        Vehicle vehicle=new Vehicle();
        vehicle.setName("HondaCity");
        System.out.println("Vehicle from non-spring context is: " + vehicle.getName());

        /*
        var keyword was introduced in java 10 .type inference is used in var
        keyword in which it detects automatically the datatype of variable
        based on surrounding context
         */
        //object created to track all the configuration
        var context=new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle veh=context.getBean(Vehicle.class);
        System.out.println("vehicle from spring context is: " + veh.getName());

        String message=context.getBean(String.class);
        System.out.println("From the spring context: " + message);

        Integer num=context.getBean(Integer.class);
        System.out.println("From spring context: " + num);
    }
}
