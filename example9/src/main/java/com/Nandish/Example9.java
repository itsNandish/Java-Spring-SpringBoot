package com.Nandish;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example9 {
    public static void main(String[] args) {

        var context=new AnnotationConfigApplicationContext(ProjectConfig.class);
        Person person=context.getBean(Person.class);
        System.out.println("Person from the spring context is: " + person.getName());
        System.out.println("Vehicle that person owns is: " + person.getVehicle());

    }
}
