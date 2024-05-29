package com.gamewizard;

/*
 * Application class to model the workings of a video game console.
 * No main() method resides here, will be implemented from GameConsoleClient.
 *
 * TO DO: add date/time field and welcome message when console turns on.
 * Should say something like, Welcome <user name>, today is: <date. time>
 * When the game "loads" Should say <console brand, version> loading <loading time>
 */
public class GameConsole {
    // Static class variables live up here!! - shared with all instances
    public static final int MIN_PLAYER = 1; //min multiplayer
    public static final int MAX_PLAYER = 4; //max multiplayer


    // Instance variables
    private String brand; // Video game console brand name
    public static final String[] VALID_CONSOLES = {"Playstation", "Xbox", "GameCube"};
    private String consoleVersion; // Version/release of the video game console
    private String welcomeMessage; // String brand
    private double loading = 0.0; // How long the console takes to load/boot up
    private String gameDisk = null; // Name of the video game for disk being inserted to play
    private boolean isGameStarted = false; // Has the player started the game, or not
    private int playerCount = MIN_PLAYER; // How many players were selected (defaults to 1 - min)
    private Multiplayer multiplayer = Multiplayer.ONE; // constraint: 1-4 players (default to "One")


    //constructors
    public GameConsole() {
        //non op ctor
    }

    public GameConsole(String brand, String ConsoleVersion, String gameDisk, double loading) {
        setBrand(brand);
        setConsoleVersion(consoleVersion);
        setWelcomeMessage(gameDisk);
        setLoading(loading);
        setGameDisk(gameDisk);
    }


    // business methods/functions
    public void powerOn() {
        System.out.println("Powering on " + brand + consoleVersion);
    }

    public void loading() {
        System.out.println("Loading time for " + brand + consoleVersion + " is " + loading);
    }

    //welcome message with date/time

    public void gameDisk() {
        System.out.println("The game, " + gameDisk + "was inserted" + "into the " + brand + consoleVersion);
    }

    public boolean isGameStarted() {
        if (isGameStarted = true) {
            System.out.println("You have started the game: " + gameDisk);
        }
        return true;
    }


    // accessor methods


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getConsoleVersion() {
        return consoleVersion;
    }

    public void setConsoleVersion(String consoleVersion) {
        this.consoleVersion = consoleVersion;
    }

    public String getWelcomeMessage() {
        return welcomeMessage;
    }

    public void setWelcomeMessage(String welcomeMessage) {
        this.welcomeMessage = welcomeMessage;
    }

    public double getLoading() {
        return loading;
    }

    public void setLoading(double loading) {
        this.loading = loading;
    }

    public String getGameDisk() {
        return gameDisk;
    }

    public void setGameDisk(String gameDisk) {
        this.gameDisk = gameDisk;
    }

    public void setGameStarted(boolean gameStarted) {
        isGameStarted = gameStarted;
    }

    public int getPlayerCount() {
        return playerCount;
    }

    public void setPlayerCount(int playerCount) {
        this.playerCount = playerCount;
    }

    public Multiplayer getMultiplayer() {
        return multiplayer;
    }

    public void setMultiplayer(Multiplayer multiplayer) {
        if (playerCount < MIN_PLAYER || playerCount > MAX_PLAYER) {
            System.out.println("Invalid number of players for multiplayer: " + multiplayer +
                    " Number of players should be between " + MIN_PLAYER + " and " + MAX_PLAYER);
        }
    }

    @Override
    public String toString() {
        return "Game Console{" + "Brand=" + getBrand() + '\'' +
                ", Version=" + getConsoleVersion() + '}' +
                ", Game Disk=" + getGameDisk() +
                ", Loading=" + getLoading() +
                ", Player Count=" + getPlayerCount() +
                ", Multiplayer=" + getMultiplayer() + '}';
    }
}


