package com.harrySpringBoot;
import com.harrySpringBoot.game.GameRunner;
import com.harrySpringBoot.game.PacMan;

public class App01GamingBasicJava {
    public static void main(String[] args) {
            
            // var game = new MarioGame();
            // var game = new ContraGame();
            var game = new PacMan();
            var gameRunner = new GameRunner(game);
            gameRunner.run();
        }
}
