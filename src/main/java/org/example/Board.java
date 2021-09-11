package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * @author colin
 */
public class Board {
    private List<Cell> cells;
    private int rows;
    private int columns;

    public Board(String[][] initValues) {
        cells = new ArrayList<>();

        for (int i = 0; i < initValues.length; i++) {
            for (int j = 0; j < initValues[i].length; j++) {
                cells.add(new Cell(i, j, initValues[i][j].equals("X")));
            }
        }

        rows = initValues.length;
        columns = initValues[0].length;
    }

    public void turn() {

    }

    public String[][] currentStatus() {
        final String[][] result = new String[rows][columns];

        cells.forEach(cell -> result[cell.getRow()][cell.getColumn()] = cell.isLive() ? "X" : "O");

        return result;
    }
}
