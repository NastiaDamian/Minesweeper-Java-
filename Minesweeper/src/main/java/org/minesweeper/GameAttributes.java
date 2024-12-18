package org.minesweeper;

public class GameAttributes {
    private static int rows;
    private static int cols;
    private static int numberOfMines;

    public static int getRows() {
        return rows;
    }

    public static void setRows(int rows) {
        GameAttributes.rows = rows;
    }

    public static int getCols() {
        return cols;
    }

    public static void setCols(int cols) {
        GameAttributes.cols = cols;
    }

    public static int getNumberOfMines() {
        return numberOfMines;
    }

    public static void setNumberOfMines(int numberOfMines) {
        GameAttributes.numberOfMines = numberOfMines;
    }
}
