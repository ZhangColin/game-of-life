package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

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
        cells = cells.stream()
                .map(cell -> cell.turn((int)cells.stream().filter(targetCell->targetCell.isLive() && cell.isNear(targetCell)).count()))
                .collect(toList());
    }

    public String[][] currentStatus() {
        final String[][] result = new String[rows][columns];

        cells.forEach(cell -> result[cell.getRow()][cell.getColumn()] = cell.isLive() ? "X" : "O");

        return result;
    }
}
