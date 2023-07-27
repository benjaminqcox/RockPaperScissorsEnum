package com.bootcamp.rps;

import java.util.Scanner;

public class UserInput {
    private static final Scanner scanner = new Scanner(System.in);

    public static void displayOptions() {
        System.out.println("Enter one of rock, paper, scissors: ");
    }

    public static RPSEnum getChoice() {
        RPSEnum choice = null;
        while (choice == null) {
            displayOptions();
            try {
                choice = RPSEnum.valueOf(scanner.nextLine().trim().toUpperCase());
            } catch (Exception e) {
                System.out.println("That is an invalid choice, try again.");
            }
        }
        return choice;
    }
    
}
