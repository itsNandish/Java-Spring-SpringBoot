package com.Nandish;

import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Random;
import java.util.function.Supplier;

public class Example6 {
    public static void main(String[] args) {

        var context=new AnnotationConfigApplicationContext(ProjectConfig.class);

        Vehicle volkswagen=new Vehicle();
        volkswagen.setName("Volkswagen");
        Supplier<Vehicle> volkswagenSupplier= ()->volkswagen;

        Supplier<Vehicle> audiSupplier=()->{
            Vehicle audi=new Vehicle();
            audi.setName("Audi");
            return audi;
        };

        Random random=new Random();
        int number=random.nextInt(10);
        System.out.println("random number: " + number);

        if(number%2==0){
            context.registerBean("volkswagen", Vehicle.class,volkswagenSupplier);

        }else{
            context.registerBean("audi",Vehicle.class,audiSupplier);
        }

        Vehicle volksVehicle=null;
        Vehicle audiVehicle=null;
        try{
            volksVehicle=context.getBean("volkswagen", Vehicle.class);
        }catch (NoSuchBeanDefinitionException e){
            System.out.println("error while creating volkswagen vehicle");
        }

        try{
            audiVehicle=context.getBean("audi", Vehicle.class);
        }catch (NoSuchBeanDefinitionException e){
            System.out.println("error while creating audi vehicle");
        }

        if(null!=volksVehicle){
            System.out.println("vehicle name from spring context is: " + volksVehicle.getName());
        }else{
            System.out.println("vehicle name from spring context is: " + audiVehicle.getName());
        }
    }
}
