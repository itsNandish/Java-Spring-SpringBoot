package com.Nandish;

import org.springframework.stereotype.Component;

@Component
public class BoseSpeakers implements Speakers{

    @Override
    public String makeSound(Song song) {
        return "Playing the song "+ song.getTitle()+ " by "
                + song.getSingerName()+
                " with Bose speakers";
    }
}
