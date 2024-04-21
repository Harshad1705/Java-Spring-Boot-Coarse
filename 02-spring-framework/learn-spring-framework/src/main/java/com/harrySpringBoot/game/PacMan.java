package com.harrySpringBoot.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PacMan implements GamingConsole{
    public void up() {
        System.out.println("going up");
    }

    public void down() {
        System.out.println("going dowm");
    }

    public void left() {
        System.out.println("going left");
    }

    public void right() {
        System.out.println("going right");
    }
}
