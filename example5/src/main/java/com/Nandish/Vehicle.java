package com.Nandish;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @PreDestroy
    public void destroy(){
        this.name="Audi";
        System.out.println("destroying the bean");
    }
@PostConstruct
    public  void initialize(){
        this.name="supra";

    }
    public static void message(){
        System.out.println("printing message from the component spring context");
    }
}
