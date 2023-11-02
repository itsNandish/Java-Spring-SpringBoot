package com.exampleBeans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example2 {
    public static void main(String[] args) {
        var context=new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle veh=context.getBean( "vehicle2",Vehicle.class);
        System.out.println(veh.getName());
    }
}
