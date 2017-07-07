package Exercises;

import java.util.Scanner;

/**
 * Created by Alex on 17-Jun-17.
 */
public class Multiplicator {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Please type a number for which you want the multiplication table up to 10");
        int selection = input.nextInt();

        for (int i = 1; i <= 10; i++) {

            System.out.println(selection + " X " + i + " = " + selection*i);
        }
    }
}
