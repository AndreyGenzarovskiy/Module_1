package task_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class StatusTest {

    /*@Test
    void getArrayCopy() {
        int[][] array = {{1, 3, 2}, {3, 4, 5}, {5, 9, 5}};
        int[][] expected = {{1, 3, 2}, {3, 4, 5}, {5, 9, 5}};
        int[][] actual = Status.getArrayCopy(array);
        assertEquals(Arrays.deepToString(expected), Arrays.deepToString(actual));
    }*/

    @Test
    void getNeighborCount() {
        int i = 0;
        int j = 0;
        int[][] array = { {1, 0, 1, 1, 0}, {1, 1, 1, 0, 0}, {1, 0, 0, 1, 1}, {1, 1, 0, 1, 0}, {1, 1, 0, 0, 1}};
        int expected = 2;
        int actual = Status.getNeighborCount(i, j, array);
        assertEquals(expected, actual);
    }

    @Test
    void getOneIfAlive() {
        int i = -1;
        int j = -1;
        int[][] array = {{1, 1, 0}, {1, 0, 1}, {1, 1, 0}};
        int expected = 0;
        int actual = Status.getOneIfAlive(i, j, array);
        assertEquals(expected, actual);
    }

    @Test
    void setNextState() {
    }

    @Test
    void getNextGeneration() {
    }

}