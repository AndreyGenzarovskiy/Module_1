package task_1;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ArraysUniqeSymbolsTest {

    @org.junit.jupiter.api.Test
    void getArrayUniqeSymbols() {
        int[] array = {1, 4, 5, 1, 1, 3};
        int expected = 4;
        int actual = ArraysUniqeSymbols.getArrayUniqeSymbols(array);
        assertEquals(expected, actual);
    }
}