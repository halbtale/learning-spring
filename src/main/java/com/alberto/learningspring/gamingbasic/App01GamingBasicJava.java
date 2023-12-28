package com.alberto.learningspring.gamingbasic;

import com.alberto.learningspring.game.GameRunner;
import com.alberto.learningspring.game.PacmanGame;

public class App01GamingBasicJava {
    public static void main(String[] args) {
        //var marioGame = new MarioGame();
        //var superContraGame = new SuperContraGame();
        var pacmanGame = new PacmanGame();
        var gameRunner = new GameRunner(pacmanGame);
        gameRunner.run();
    }
}
