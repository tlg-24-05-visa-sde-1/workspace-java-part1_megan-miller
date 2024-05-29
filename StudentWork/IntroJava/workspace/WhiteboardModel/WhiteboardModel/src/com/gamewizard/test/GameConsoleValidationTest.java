package com.gamewizard.test;

import com.gamewizard.GameConsole;

class GameConsoleValidationTest {
    public static void main(String[] args) {
        GameConsole gc1 = new GameConsole();

        gc1.setPlayerCount(1);
        System.out.println(gc1.getPlayerCount());

        gc1.setPlayerCount(3);
        System.out.println(gc1.getPlayerCount());

        gc1.setPlayerCount(5);
        System.out.println(gc1.getPlayerCount());

    }
}
