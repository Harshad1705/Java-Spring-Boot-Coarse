package com.harrySpringBoot;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.harrySpringBoot.game.GameRunner;
import com.harrySpringBoot.game.GamingConsole;


public class App03GamingBasicJava {
    public static void main(String[] args) {
            
        try (var context = new AnnotationConfigApplicationContext           (GamingConfiguration.class)) {
            
            context.getBean(GamingConsole.class).up();
            context.getBean(GameRunner.class).run();
            
        };


        }
}
