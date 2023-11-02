package com.Nandish;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
@Order(1)
public class VehicleStartCheckAspect {
    private Logger logger=Logger.getLogger(VehicleStartCheckAspect.class.getName());
    @Before("execution(* com.Nandish.*.*(..)) && args(vehicleStarted,..)")
    public void checkVehicleStarted(JoinPoint joinPoint,boolean vehicleStarted)throws Throwable{
        if(!vehicleStarted){
            throw new RuntimeException("vehicle is not started");
        }
    }
}
