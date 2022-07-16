package main;

import game.GameLife;
import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        System.out.print("Enter width and height of field: ");
        Scanner scanner = new Scanner(System.in);
        int width = scanner.nextInt();
        int height = scanner.nextInt();
        GameLife gameLife = new GameLife(width, height);
        gameLife.getNextGeneration();
    }
}
