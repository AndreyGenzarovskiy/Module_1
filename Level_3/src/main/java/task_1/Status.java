package task_1;

import java.util.Arrays;

public class Status {
    public static int[][] array = FieldCreate.getRandomBinary2DArray();
    public static int[][] arrCopy = ArrayCopy.getArrayCopy(array);

   /* public static int[][] getArrayCopy(int[][] array){
        int[][] copiedArray = new int[array.length][array[0].length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                copiedArray[i][j] = array[i][j];
            }
        }
        return copiedArray;
    }*/

    public static int getNeighborCount(int i, int j, int[][] arrCopy){
        int count = 0;
        count += getOneIfAlive(i - 1, j - 1, arrCopy);
        count += getOneIfAlive(i - 1, j,     arrCopy);
        count += getOneIfAlive(i - 1, j + 1, arrCopy);
        count += getOneIfAlive(i,     j - 1, arrCopy);
        count += getOneIfAlive(i,     j + 1, arrCopy);
        count += getOneIfAlive(i + 1, j - 1, arrCopy);
        count += getOneIfAlive(i + 1, j,     arrCopy);
        count += getOneIfAlive(i + 1, j + 1, arrCopy);
        return count;
    }

    public static int getOneIfAlive(int i, int j, int[][] arrCopy){
        if (i >= 0 && i < arrCopy.length && j >= 0 && j < arrCopy[0].length) {
            return arrCopy[i][j];
        }
        return  0;
    }

    public static void setNextState(int i, int j, int[][] arrCopy){
        int count = getNeighborCount(i, j, arrCopy);
        if(arrCopy[i][j] == 1){
            if(count < 2 || count > 3){
                array[i][j] = 0;
            }
        }else {
            if (count == 3) {
                array[i][j] = 1;
            }
        }
    }

    public static void getNextGeneration(){
        arrCopy = ArrayCopy.getArrayCopy(array);
        for(int i = 0; i < arrCopy.length; i++)
        {
            for(int j = 0; j < arrCopy[0].length; j++)
            {
                setNextState(i, j, arrCopy);
            }
        }
        for (int[] ints : array) {
            System.out.println(Arrays.toString(ints));
        }
    }

}


