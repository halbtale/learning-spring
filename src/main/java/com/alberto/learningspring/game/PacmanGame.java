package com.alberto.learningspring.game;

import org.springframework.stereotype.Component;

@Component
public class PacmanGame implements GamingConsole{

    public void up() {
        System.out.println("PAC-UP");
    }

    public void down() {
        System.out.println("PAC-DOWN");
    }

    public void left() {
        System.out.println("PAC-LEFT");
    }

    public void right() {
        System.out.println("PAC-RIGHT");
    }
}
