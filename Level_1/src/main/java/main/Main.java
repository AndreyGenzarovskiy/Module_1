package main;
import task_1.ArraysUniqeSymbols;

import java.util.Arrays;
import static task_3.AreaOfTriangle.*;
import static task_2.KnightMove.isCorrectKnightMove;
public class Main {
    public static void main(String[] args){
        int[] array = {1, 3, 2, 1, 4, 5};
        System.out.println(Arrays.toString(array));
        System.out.println(ArraysUniqeSymbols.getArrayUniqeSymbols(array));
        System.out.println(isCorrectKnightMove(2, 3, 0, 2));
        System.out.println(getAreaOfTriangle(0,3,4,0,2,0));
    }
}
