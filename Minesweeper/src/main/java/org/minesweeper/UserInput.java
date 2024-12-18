package org.minesweeper;

import java.util.Scanner;

public class UserInput {
    private static Scanner scanner = new Scanner(System.in);

    public static void askNumberOfMines() {
        System.out.println("How many mines do you want on the field?");
        int numberOfMines = scanner.nextInt();
        if (numberOfMines < 1) {
            System.out.println("The number of mines must be at least 1.");
            askNumberOfMines();
        } else {
            GameAttributes.setNumberOfMines(numberOfMines);
        }
    }
}
