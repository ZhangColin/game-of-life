package org.example;

/**
 * @author colin
 */
public class Cell {
    private final int row;
    private final int column;
    private final boolean live;

    public Cell(int row, int column, boolean live) {
        this.row = row;
        this.column = column;
        this.live = live;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public boolean isLive(){
        return live;
    }

    public boolean isDead() {
        return !live;
    }

    public Cell turn(int nearCount) {
        boolean newCellLive;

        if (nearCount < 2) {
            newCellLive = false;
        }
        else {
            newCellLive = live;
        }

        return new Cell(row, column, newCellLive);
    }

    public boolean isNear(Cell targetCell) {
        return !isSameCell(targetCell)
                && Math.abs(targetCell.column - column) <= 1
                && Math.abs(targetCell.row - row) <= 1;
    }

    private boolean isSameCell(Cell targetCell) {
        return targetCell.row == row && targetCell.column == column;
    }
}
