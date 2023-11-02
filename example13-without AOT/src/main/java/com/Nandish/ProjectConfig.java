package com.Nandish;


import org.springframework.context.annotation.*;

/*
spring configuration annotation is part of spring core framework spring
 configuration annotation indicates that the class @bean definition methods.
 so spring container can process the class and generate spring beans
 to be used in application
 */
@Configuration
@ComponentScan("com.Nandish")
@EnableAspectJAutoProxy
public class ProjectConfig {

}
