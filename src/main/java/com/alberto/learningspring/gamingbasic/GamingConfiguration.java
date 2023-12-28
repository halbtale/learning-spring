package com.alberto.learningspring.gamingbasic;

import com.alberto.learningspring.game.GameRunner;
import com.alberto.learningspring.game.GamingConsole;
import com.alberto.learningspring.game.PacmanGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {
    @Bean
    public GamingConsole game() {
        return new PacmanGame();
    }

    @Bean
    public GameRunner gameRunner(GamingConsole game) {
        return new GameRunner(game);
    }
}
