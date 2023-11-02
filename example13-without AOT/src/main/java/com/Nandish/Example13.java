package com.Nandish;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example13 {
    public static void main(String[] args) {

        var context=new AnnotationConfigApplicationContext(ProjectConfig.class);
        var vs=context.getBean(VehicleServices.class);
        System.out.println(vs.getClass());
        Song song=new Song();
        song.setSingerName("eminem");
        song.setTitle("flashBack");
        boolean vehicleStarted=true;
        String moveVehicle= vs.moveVehicle(vehicleStarted);
//        String playMusic=vs.playMusic(vehicleStarted,song);
//        String applyBrake=vs.applyBrake(vehicleStarted);





    }
}
