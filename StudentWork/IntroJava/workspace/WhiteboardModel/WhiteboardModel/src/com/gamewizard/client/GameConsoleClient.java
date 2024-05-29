package com.gamewizard.client;

import com.gamewizard.GameConsole;

/*
 *
 */
class GameConsoleClient {
    public static void main(String[] args) {
        // Creates a GameConsole instance and sets its properties
        GameConsole gc1 = new GameConsole();
        gc1.setBrand("Playstation");
        gc1.setConsoleVersion("4");
        gc1.setLoading(4.35);
        gc1.setGameDisk("Fallout 4");

        // 2nd GameConsole instance
        GameConsole gc2 = new GameConsole();
        gc2.setBrand("Xbox");
        gc2.setConsoleVersion("360");
        gc2.setLoading(7.45);
        gc2.setGameDisk("Left 4 Dead");

        // 3rd GameConsole instance
        GameConsole gc3 = new GameConsole("Nintendo", "Game Cube", "Super Smash Bros. Melee", 9.25);

        //gc1
        gc1.powerOn();
        gc1.loading();
        System.out.println(gc1.getConsoleVersion());
        System.out.println();

        //gc2
        gc2.powerOn();
        gc2.loading();
        System.out.println(gc2.getConsoleVersion());
        System.out.println();

        //gc3
        gc3.powerOn();
        gc3.loading();
        System.out.println(gc3.getConsoleVersion());

    }
}
