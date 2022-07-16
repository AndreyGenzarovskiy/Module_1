package task_1;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class FieldCreate {

    private static int[] getBinaryRandomArray(int n) {
        Random random = new Random();
        int[] arr = new int[n];
        Arrays.fill(arr, 0);

        for (int i = 0; i < arr.length / 2 + 1; i++) {
            int z = 0;
            while (arr[z] == 1) {
                z = random.nextInt(arr.length);
            }
            arr[z] = 1;
        }
        return arr;
    }

        public static int[][] getRandomBinary2DArray() {
            Scanner scanner = new Scanner(System.in);
            final int n = scanner.nextInt();
            final int m = scanner.nextInt();

            int[][] array2 = new int[m][n];
            for (int i = 0; i < array2.length; i++) {
                for (int j = 0; j < array2[i].length; j++) {
                    array2[i] = getBinaryRandomArray(n);
                }
            }
        return array2;
    }
}

