package main;
import task_1.ArraysUniqeSymbols;

import java.util.Arrays;

import static task_1.InitializeArray.getInitializeArray;

public class Main {
    public static void main(String[] args){
        int[] array = getInitializeArray(10, 0, 20);
        System.out.println(Arrays.toString(array));
        System.out.println(ArraysUniqeSymbols.getArrayUniqeSymbols(array));
    }
}
