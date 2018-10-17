package com.test.spring;

import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

/*@Component
@Conditional(Condition.class)*/
public class Dragon implements Evil {

    private String name;

    private String weapon;

    public Dragon(String weapon) {
        this.weapon = weapon;
    }

    public Dragon() {
    }

    @Override
    public void resist() {
        System.out.println(name + " is againest with " + weapon);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
