package com.Nandishexample3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        var context=new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle veh1=context.getBean(Vehicle.class);
        System.out.println("component vehicle name from spring context : " + veh1.getName());
        Vehicle.message();

    }
}
