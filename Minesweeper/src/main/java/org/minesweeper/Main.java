package org.minesweeper;

public class Main {
    public static void main(String[] args) {
        GameAttributes.setRows(9);
        GameAttributes.setCols(9);
        char[][] minefield = new char[GameAttributes.getRows()][GameAttributes.getCols()];

        UserInput.askNumberOfMines();

        if (GameAttributes.getNumberOfMines() > GameAttributes.getRows() * GameAttributes.getCols()) {
            System.out.println("Too many mines! The maximum number of mines is " + (GameAttributes.getRows() * GameAttributes.getCols()) + ".");
            UserInput.askNumberOfMines();
        }

        Minefield.createMinefield(minefield, GameAttributes.getNumberOfMines());
        PrintMinefield.printMinefield(minefield);
    }
}

