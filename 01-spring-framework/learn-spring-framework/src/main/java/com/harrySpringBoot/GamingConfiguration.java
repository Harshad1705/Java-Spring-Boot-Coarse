package com.harrySpringBoot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.harrySpringBoot.game.GameRunner;
import com.harrySpringBoot.game.GamingConsole;
import com.harrySpringBoot.game.PacMan;

@Configuration
public class GamingConfiguration {

    @Bean
    public GamingConsole game() {
        var game = new PacMan();
        return game;
    }

    @Bean
    public GameRunner gameRunner(GamingConsole game) {
        var gameRunner = new GameRunner(game);
        return gameRunner;
    }
}
