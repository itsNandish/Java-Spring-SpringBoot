package com.Nandish;

import org.springframework.stereotype.Component;

@Component
public class MRFTyres implements Tyres {


    @Override
    public String rotate() {
        return "vehicle is started with the help of MRFTyres";
    }

    @Override
    public String stop() {
        return "vehicle stopped with the help of MRFTyres";
    }
}
