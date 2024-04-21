package com.harrySpringBoot.game;

import org.springframework.stereotype.Component;

@Component
public class ContraGame implements GamingConsole {
    
    public void up() {
        System.out.println("up");
    }

    public void down() {
        System.out.println("sit dowm");
    }

    public void left() {
        System.out.println("Go back");
    }

    public void right() {
        System.out.println("shoot bullet");
    }
}
