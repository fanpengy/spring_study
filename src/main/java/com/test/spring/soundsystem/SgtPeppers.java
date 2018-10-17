package com.test.spring.soundsystem;

import org.springframework.stereotype.Component;

@Component
public class SgtPeppers implements CompactDisc {

    @Override
    public void play() {
        System.out.println("Playing SgtPeppers");
    }
}
