package org.example;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author colin
 */
public class CellTest {
    @Test
    public void cell_0_1_isNear_cell_0_0() {
        Cell originCell = new Cell(0, 0, true);
        Cell targetCell = new Cell(0, 1, true);

        Assert.assertTrue(originCell.isNear(targetCell));
    }

    @Test
    public void cell_0_2_isNotNear_0_0() {
        Cell originCell = new Cell(0, 0, true);
        Cell targetCell = new Cell(0, 2, true);

        Assert.assertFalse(originCell.isNear(targetCell));
    }

    @Test
    public void cell_1_0_isNear_cell_0_0() {
        Cell originCell = new Cell(0, 0, true);
        Cell targetCell = new Cell(1, 0, true);

        Assert.assertTrue(originCell.isNear(targetCell));
    }

    @Test
    public void cell_2_0_isNotNear_0_0() {
        Cell originCell = new Cell(0, 0, true);
        Cell targetCell = new Cell(2, 0, true);

        Assert.assertFalse(originCell.isNear(targetCell));
    }

    @Test
    public void cell_2_1_isNear_cell_2_2() {
        Cell originCell = new Cell(2, 2, true);
        Cell targetCell = new Cell(2, 1, true);

        Assert.assertTrue(originCell.isNear(targetCell));
    }

    @Test
    public void cell_2_0_isNotNear_cell_2_2() {
        Cell originCell = new Cell(2, 2, true);
        Cell targetCell = new Cell(2, 0, true);

        Assert.assertFalse(originCell.isNear(targetCell));
    }

    @Test
    public void cell_1_2_isNear_cell_2_2() {
        Cell originCell = new Cell(2, 2, true);
        Cell targetCell = new Cell(1, 2, true);

        Assert.assertTrue(originCell.isNear(targetCell));
    }

    @Test
    public void cell_0_2_isNotNear_cell_2_2() {
        Cell originCell = new Cell(2, 2, true);
        Cell targetCell = new Cell(0, 2, true);

        Assert.assertFalse(originCell.isNear(targetCell));
    }

    @Test
    public void cell_0_0_isNotNear_cell_0_0() {
        Cell originCell = new Cell(0, 0, true);
        Cell targetCell = new Cell(0, 0, true);

        Assert.assertFalse(originCell.isNear(targetCell));
    }

    @Test
    public void cell_turn_when_cell_is_dead_and_near_count_less_two_then_cell_is_dead() {
        Cell originCell = new Cell(0,0, false);

        Cell newCell = originCell.turn(1);

        Assert.assertTrue(newCell.isDead());
    }
}
