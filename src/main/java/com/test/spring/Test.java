package com.test.spring;

import com.test.spring.soundsystem.CDPlayer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("knight.xml");
        Knight knight = (Knight) context.getBean("knight");
        knight.embarkOnQuest();
        CDPlayer p = context.getBean(CDPlayer.class);
        p.play();
        context.close();
    }
}
