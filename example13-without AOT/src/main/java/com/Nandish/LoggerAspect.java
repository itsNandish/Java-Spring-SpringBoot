package com.Nandish;

import org.apache.commons.logging.Log;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.Instant;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

@Aspect
@Component
@Order(2)
public class LoggerAspect {
    private Logger logger=Logger.getLogger(LoggerAspect.class.getName());

    @Around("execution(* com.Nandish.*.*(..))")
    public void log(ProceedingJoinPoint joinPoint) throws Throwable{
        logger.info(joinPoint.getSignature().toString()+ "method execution start");
        Instant start=Instant.now();
        joinPoint.proceed();
        Instant finish=Instant.now();
        long timeElapsed= Duration.between(start,finish).toMillis();
        logger.info("time took to execute the method: " + timeElapsed);
        logger.info(joinPoint.getSignature().toString() + "method execution end");
    }
    @AfterThrowing(value = "execution(* com.Nandish.*.*(..))",throwing = "ex")
    public void logException(JoinPoint joinPoint,Exception ex){
        logger.log(Level.SEVERE,joinPoint.getSignature() + "an exception " +
                "thrown with the help of @AfterThrowing which happened due to : " + ex.getMessage());
    }
    @AfterReturning(value = "execution(* com.Nandish.*.*(..))", returning = "retVal")
    public void logStatus(JoinPoint joinPoint, Object retVal){
        logger.log(Level.INFO,joinPoint.getSignature() + "method successfully processed with the status" +
                ""+ retVal.toString());
    }

}
