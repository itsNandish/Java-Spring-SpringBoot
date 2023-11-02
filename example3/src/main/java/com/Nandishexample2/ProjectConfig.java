package com.Nandishexample2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {
//    primary bean is the one which spring will choose
//    if it has multiple options, and you don't specify a name
    @Primary
    @Bean(name = "supraVehicle")
    Vehicle vehicle1(){
        var veh=new Vehicle();
        veh.setName("supra");
        return veh;
    }

    @Bean(value = "lamboVehicle")
    Vehicle vehicle2(){
        var veh=new Vehicle();
        veh.setName("Lamborghini");
        return veh;
    }
    @Bean("benzVehicle")
    Vehicle vehicle3(){
        var veh=new Vehicle();
        veh.setName("Benz");
        return veh;
    }
}
