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

    @Test
    public void less_two_case_2() {
        Board board = new Board(new String[][]{
                {"O", "O", "O"},
                {"O", "X", "O"},
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

    @Test
    public void less_two_case_3() {
        Board board = new Board(new String[][]{
                {"O", "X", "O"},
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

    @Test
    public void less_two_case_4() {
        Board board = new Board(new String[][]{
                {"O", "X", "O"},
                {"O", "X", "O"},
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

    @Test
    public void equals_two_case_1() {
        Board board = new Board(new String[][]{
                {"O", "X", "O"},
                {"O", "O", "X"},
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

    @Test
    public void equals_two_case_2() {
        Board board = new Board(new String[][]{
                {"O", "X", "O"},
                {"O", "X", "X"},
                {"O", "O", "O"}
        });

        board.turn();

        String[][] result = board.currentStatus();

        Assert.assertArrayEquals(result, new String[][]{
                {"O", "X", "X"},
                {"O", "X", "X"},
                {"O", "O", "O"}
        });
    }

    @Test
    public void equals_two_case_3() {
        Board board = new Board(new String[][]{
                {"X", "O", "O"},
                {"O", "O", "X"},
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

    @Test
    public void equals_two_case_4() {
        Board board = new Board(new String[][]{
                {"X", "O", "O"},
                {"O", "X", "X"},
                {"O", "O", "O"}
        });

        board.turn();

        String[][] result = board.currentStatus();

        Assert.assertArrayEquals(result, new String[][]{
                {"O", "X", "O"},
                {"O", "X", "O"},
                {"O", "O", "O"}
        });
    }
}
