package main;
import task_1.ArraysUniqeSymbols;

import java.util.Arrays;

import static task_1.InitializeArray.getInitializeArray;
import static task_2.KnightMove.isCorrectKnightMove;
public class Main {
    public static void main(String[] args){
       // int[] array = getInitializeArray(10, 0, 20);
       // System.out.println(Arrays.toString(array));
      // System.out.println(ArraysUniqeSymbols.getArrayUniqeSymbols(array));
        System.out.println(isCorrectKnightMove(2, 3, 0, 2));
    }
}
