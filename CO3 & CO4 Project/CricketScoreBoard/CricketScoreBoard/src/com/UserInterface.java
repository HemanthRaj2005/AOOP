package com;

import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private Database database;

    public UserInterface() {
        scanner = new Scanner(System.in);
        database = new Database();
    }

    public void initialize() {
        System.out.println("Welcome to the Cricket Scoreboard Management System");
        // Initialize UI components and event handlers

        // Sample interaction
        while (true) {
            System.out.println("1. Add Player");
            System.out.println("2. Display Players");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter player name: ");
                    String playerName = scanner.nextLine();
                    Player newPlayer = new Player(playerName);
                    database.addPlayer(newPlayer);
                    System.out.println("Player added: " + playerName);
                    break;
                case 2:
                    System.out.println("List of Players:");
                    database.displayPlayers();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option, please try again.");
            }
        }
    }
}

