package com.test.spring.soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer {

    private CompactDisc cd;

    @Autowired(required = false)
    public CDPlayer(CompactDisc cd) {
        this.cd = cd;
    }

    public void play() {
        if (this.cd == null) {
            System.out.println("no cd");
            return;
        }
        this.cd.play();
    }
}
