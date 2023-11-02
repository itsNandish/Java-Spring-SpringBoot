package com.Nandish;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SonySpeakers implements Speakers{

    @Override
    public String makeSound(Song song) {

        return "Playing the song "+ song.getTitle()+ " by "
                + song.getSingerName()+
                " with sony speakers";
    }
}
