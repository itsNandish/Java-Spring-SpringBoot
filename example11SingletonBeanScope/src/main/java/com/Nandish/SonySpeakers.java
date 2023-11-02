package com.Nandish;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SonySpeakers implements Speakers{

    @Override
    public String makeSound() {

        return "playing music with sony speakers";
    }
}
