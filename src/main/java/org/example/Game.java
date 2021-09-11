package org.example;

import java.util.Random;

/**
 * @author colin
 */
public class Game {
    private Board board;

    public Game(String[][] initValue) {
        board = new Board(initValue);
    }

    public Game(int rows, int columns) {
        String[][] initValue = new String[rows][columns];
        final Random random = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                initValue[i][j] = random.nextInt(2) == 1 ? "X" : "O";
            }
        }

        board = new Board(initValue);
    }

    public void play() {
        board.turn();
    }

    public void showTable() {
        final String[][] result = board.currentStatus();

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j]=="O"?" ":"X");
            }
            System.out.println();
        }
    }
}
