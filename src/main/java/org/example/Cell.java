package org.example;

/**
 * @author colin
 */
public class Cell {
    private final int row;
    private final int column;
    private final boolean isLive;

    public Cell(int row, int column, boolean isLive) {
        this.row = row;
        this.column = column;
        this.isLive = isLive;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public boolean isLive() {
        return isLive;
    }

    public boolean isNear(Cell targetCell) {
        return ((targetCell.column - column) <= 1 && (targetCell.column - column) >= -1)
                && ((targetCell.row - row) <= 1 && (targetCell.row - row) >= -1);
    }
}
