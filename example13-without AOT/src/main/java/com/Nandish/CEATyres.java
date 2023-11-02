package com.Nandish;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class CEATyres implements Tyres{


    @Override
    public String rotate() {
        return "vehicle moving with the help of CEATyres";
    }

    @Override
    public String stop() {
        return "vehicle stopped with the help of CEATyres";
    }
}
