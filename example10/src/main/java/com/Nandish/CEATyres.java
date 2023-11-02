package com.Nandish;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class CEATyres implements Tyres{

    @Override
    public String rotate() {
        return "Vehicle is moving with CEATyres";
    }
}
