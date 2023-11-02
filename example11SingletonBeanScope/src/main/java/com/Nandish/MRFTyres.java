package com.Nandish;

import org.springframework.stereotype.Component;

@Component
public class MRFTyres implements Tyres{


    @Override
    public String rotate() {
        return "Vehicle is moving with MRFTyres";
    }
}
