package com.Nandish;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example5 {
    public static void main(String[] args) {

        var context=new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle veh=context.getBean(Vehicle.class);
        System.out.println("component vehicle from spring context is: " + veh.getName());
        Vehicle.message();
        context.close();


    }
}
