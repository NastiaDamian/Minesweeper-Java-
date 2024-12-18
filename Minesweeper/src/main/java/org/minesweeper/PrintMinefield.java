package org.minesweeper;

public class PrintMinefield {
    public static void printMinefield(char[][] minefield) {
        for (int i = 0; i < minefield.length; i++) {
            for (int j = 0; j < minefield[i].length; j++) {
                System.out.print(minefield[i][j] + " ");
            }
            System.out.println();
        }
    }
}
