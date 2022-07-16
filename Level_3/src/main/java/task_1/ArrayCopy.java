package task_1;

public class ArrayCopy {
    public static int[][] getArrayCopy(int[][] array){
        int[][] copiedArray = new int[array.length][array[0].length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                copiedArray[i][j] = array[i][j];
            }
        }
        return copiedArray;
    }
}
