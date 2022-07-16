package game;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class GameLifeTest {

    @org.junit.jupiter.api.Test
    void getArrCopy() {
        int height = 3;
        int wight = 3;
        GameLife gameLife = new GameLife(wight, height);
        int[][] array = {{1, 3, 2}, {3, 4, 5}, {5, 9, 5}};
        int[][] expected = {{1, 3, 2}, {3, 4, 5}, {5, 9, 5}};
        int[][] actual = gameLife.getArrayCopy(array);
        assertEquals(Arrays.deepToString(expected), Arrays.deepToString(actual));
    }

    @org.junit.jupiter.api.Test
    void getOneIfAlivePositive() {
        int height = 3;
        int wight = 5;
        GameLife gameLife = new GameLife(wight, height);
        int i = -1;
        int j = -1;
        int[][] arr = {{1, 0, 1, 1, 0}, {1, 1, 0, 1, 0}, {1, 1, 0, 1, 0}};
        int expected = 0;
        int actual = gameLife.getOneIfAlive(i, j, arr);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void getOneIfAliveNegative() {
        int height = 3;
        int wight = 5;
        GameLife gameLife = new GameLife(wight, height);
        int i = 1;
        int j = 3;
        int[][] arr = {{1, 0, 1, 1, 0}, {1, 1, 0, 1, 0}, {1, 1, 0, 1, 0}};
        int expected = 1;
        int actual = gameLife.getOneIfAlive(i, j, arr);
        assertEquals(expected, actual);
    }

    @Test
    void getNeighborCount() {
        int height = 5;
        int wight = 5;
        GameLife gameLife = new GameLife(wight, height);
        int i = 0;
        int j = 0;
        int[][] array = { {1, 0, 1, 1, 0}, {1, 1, 1, 0, 0}, {1, 0, 0, 1, 1}, {1, 1, 0, 1, 0}, {1, 1, 0, 0, 1}};
        int expected = 2;
        int actual = gameLife.getNeighborCount(i, j, array);
        assertEquals(expected, actual);
    }

    @Test
    void getNextState() {
        int height = 5;
        int wight = 5;
        GameLife gameLife = new GameLife(wight, height);
        int i = 2;
        int j = 3;
        int[][] array = { {1, 0, 1, 1, 0},
                          {1, 1, 1, 0, 0},
                          {1, 0, 0, 1, 1},
                          {1, 1, 0, 1, 0},
                          {1, 1, 0, 0, 1} };
        int expected = 1;
        int actual = gameLife.getNextState(i, j, array);
        assertEquals(expected, actual);
    }

    @Test
    void getNextState2() {
        int height = 5;
        int wight = 5;
        GameLife gameLife = new GameLife(wight, height);
        int i = 4;
        int j = 1;
        int[][] array = { {1, 0, 1, 1, 0},
                          {1, 1, 1, 0, 0},
                          {1, 0, 0, 1, 1},
                          {1, 1, 0, 1, 0},
                          {1, 0, 0, 0, 1} };
        int expected = 1;
        int actual = gameLife.getNextState(i, j, array);
        assertEquals(expected, actual);
    }

    @Test
    void getNextState3() {
        int height = 5;
        int wight = 5;
        GameLife gameLife = new GameLife(wight, height);
        int i = 2;
        int j = 0;
        int[][] array = { {1, 0, 1, 1, 0},
                          {1, 1, 1, 0, 0},
                          {1, 0, 0, 1, 1},
                          {1, 1, 0, 1, 0},
                          {1, 0, 0, 0, 1} };
        int expected = 0;
        int actual = gameLife.getNextState(i, j, array);
        assertEquals(expected, actual);
    }
}