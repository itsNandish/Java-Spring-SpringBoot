package com.Nandishexample3;

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
    public static void message(){
        System.out.println("Printing message from the component Vehicle bean");
    }
}
