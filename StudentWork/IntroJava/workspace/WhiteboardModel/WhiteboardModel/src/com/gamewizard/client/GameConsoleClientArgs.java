package com.gamewizard.client;

import com.gamewizard.GameConsole;

import java.util.Arrays;
/*
 * Allows user to supply command line args for various fields,
 * so an instance of the business class is created based on user inputs
 */

class GameConsoleClientArgs {
    private static String gameDisk;

    public static void main(String[] args) {
        if (args.length < 4) {
            String usage = "Usage: java.com.gamewizard.client.GameConsoleClientArgs <brand>, <version>, <gameDisk>" +
                    "\n <multiplayer>";
            String example = "Example: java.com.gamewizard.client.GameConsoleClientArgs Playstation, 4, Fallout 4, ONE";
            String note = "Note: " +
                    "\n The available brands are: " + Arrays.toString(GameConsole.VALID_CONSOLES) +
                    "\n The number of players for Multiplayer must be between " + GameConsole.MIN_PLAYER +
                    "\n to " + GameConsole.MAX_PLAYER;
            System.out.println(usage);
            System.out.println(example);
            System.out.println(note);
            return;
        }
        System.out.println(Arrays.toString(GameConsole.VALID_CONSOLES));
        String brand = args[0];
        String version = args[1];
        String gameDisk = args[2];
        double loading = Double.parseDouble(args[3]);

        GameConsole console = new GameConsole(brand, version, gameDisk, loading);
        System.out.println("Ready Player? Here are the details for your new Game Console: " + console);

    }

}
