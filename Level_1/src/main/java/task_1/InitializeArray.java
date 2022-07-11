package task_1;

import java.util.Random;

public class InitializeArray {
    public static int[] getInitializeArray(int size, int leftBoarder, int rightBoarder) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(rightBoarder - leftBoarder) + leftBoarder;
        }
        return array;
    }
}
