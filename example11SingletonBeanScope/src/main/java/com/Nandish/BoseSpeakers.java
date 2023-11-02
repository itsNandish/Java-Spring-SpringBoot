package com.Nandish;

import org.springframework.stereotype.Component;

@Component
public class BoseSpeakers implements Speakers{
    @Override
    public String makeSound() {
        return "playing music with bose speakers";
    }
}
