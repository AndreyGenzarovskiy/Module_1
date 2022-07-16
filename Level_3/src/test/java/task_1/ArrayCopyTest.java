package task_1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ArrayCopyTest {

    @Test
    void getArrayCopy() {
        int[][] array = {{1, 3, 2}, {3, 4, 5}, {5, 9, 5}};
        int[][] expected = {{1, 3, 2}, {3, 4, 5}, {5, 9, 5}};
        int[][] actual = ArrayCopy.getArrayCopy(array);
        assertEquals(Arrays.deepToString(expected), Arrays.deepToString(actual));
    }
}