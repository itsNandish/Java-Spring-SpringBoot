package com.Nandish;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class Example10 {
    public static void main(String[] args) {



        var context=new AnnotationConfigApplicationContext(ProjectConfig.class);
       VehicleServices v1=context.getBean(VehicleServices.class);
        System.out.println("hashcode of v1 is " + v1.hashCode());
       VehicleServices v2=context.getBean("vehicleServices",VehicleServices.class);
        System.out.println("hashcode of v2 is " + v2.hashCode());
        if(v1==v2){
            System.out.println("vehicleServices is a singleton bean scope");
        }else{
            System.out.println("vehicleServices is a prototype bean scope");
        }
    }
}
