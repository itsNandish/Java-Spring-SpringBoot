package com.Nandish;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example8 {
    public static void main(String[] args) {

        var context=new AnnotationConfigApplicationContext(ProjectConfig.class);
        System.out.println("before retrieving the person bean from the spring context");
        Person person=context.getBean(Person.class);
        System.out.println("after retrieving the person bean from the spring context");

    }
}
