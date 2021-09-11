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
}
