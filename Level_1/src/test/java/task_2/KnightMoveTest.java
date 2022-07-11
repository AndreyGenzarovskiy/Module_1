package task_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KnightMoveTest {

    @Test
    void isCorrectKnightMove() {
        int knightX = 2;
        int knightY = 3;
        int nextMoveX = 1;
        int nextMoveY = 1;
        boolean expected = true;
        boolean actual = KnightMove.isCorrectKnightMove(knightX, knightY, nextMoveX, nextMoveY);
        assertEquals(expected, actual, "knight cant go there!");
    }
}