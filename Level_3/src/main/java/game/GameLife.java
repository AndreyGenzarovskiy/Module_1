package game;

import java.util.Arrays;
import java.util.Random;

public class GameLife {

    private final int[][] array;

    public GameLife(int width, int height) {
        Random random = new Random();
        array = new int[width][height];
        for(int i = 0; i < width; i++){
            for(int j = 0; j < height; j++){
                array[i][j] = random.nextInt(0,2);
            }
        }
    }

    int[][] getArrayCopy(int[][] array){
        int[][] copiedArray = new int[array.length][array[0].length];
        for (int i = 0; i < array.length; i++) {
            System.arraycopy(array[i], 0, copiedArray[i], 0, array[i].length);
        }
        return copiedArray;
    }

    int getNeighborCount(int i, int j, int[][] arrCopy){
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

    int getOneIfAlive(int i, int j, int[][] arrCopy){
        if (i >= 0 && i < arrCopy.length && j >= 0 && j < arrCopy[0].length) {
            return arrCopy[i][j];
        }
        return  0;
    }

    int getNextState(int i, int j, int[][] arrCopy){
        int count = getNeighborCount(i, j, arrCopy);
        if(arrCopy[i][j] == 1){
            if(count < 2 || count > 3){
                return 0;
            }
        }else if (count == 3) {
            return 1;
        }
        return arrCopy[i][j];
    }

    public void getNextGeneration(){
        for (int[] value : array) {
            System.out.println(Arrays.toString(value)); //Print original array
        }
        System.out.println();
        int[][] arrCopy = getArrayCopy(array);
        for(int i = 0; i < arrCopy.length; i++)
        {
            for(int j = 0; j < arrCopy[0].length; j++)
            {
                array[i][j] = getNextState(i, j, arrCopy);
            }
        }
        for (int[] ints : array) {
            System.out.println(Arrays.toString(ints));
        }
    }



}
