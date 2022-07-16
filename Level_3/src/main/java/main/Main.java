package main;
import task_1.FieldCreate;
import task_1.Status;
import java.util.Arrays;
import java.util.Scanner;

import static task_1.Status.array;

public class Main {
    public static void main(String[] args){
        System.out.print("Enter width and height of field: ");
        for( int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
        System.out.println();
        Status.getNextGeneration();
    }
}