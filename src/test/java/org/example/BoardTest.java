package org.example;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author colin
 */
public class BoardTest {
    @Test
    public void less_two_case_1() {
        Board board = new Board(new String[][]{
                {"O", "O", "O"},
                {"O", "O", "O"},
                {"O", "O", "O"}
        });

        board.turn();

        String[][] result = board.currentStatus();

        Assert.assertArrayEquals(result, new String[][]{
                {"O", "O", "O"},
                {"O", "O", "O"},
                {"O", "O", "O"}
        });
    }
}
