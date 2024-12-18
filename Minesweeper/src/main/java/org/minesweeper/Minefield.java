package org.minesweeper;

import java.util.Random;

public class Minefield {
    public static void createMinefield(char[][] minefield, int numberOfMines) {
        for (int i = 0; i < minefield.length; i++) {
            for (int j = 0; j < minefield[i].length; j++) {
                minefield[i][j] = '.';
            }
        }

        Random random = new Random();
        int placedMines = 0;

        while (placedMines < numberOfMines) {
            int row = random.nextInt(minefield.length);
            int col = random.nextInt(minefield[0].length);

            if (minefield[row][col] == '.') {
                minefield[row][col] = 'X';
                placedMines++;
            }
        }
    }
}
