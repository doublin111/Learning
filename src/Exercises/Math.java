package Exercises;

import java.util.Scanner;

/**
 * Created by Alex on 16-Mar-17.
 */
public class Math {

    public static void main(String[] args) {
        System.out.println("The result is: " + Calculate());
    }

    public static int Calculate() {

        Scanner userInput = new Scanner(System.in);

        System.out.println("How many numbers do you want to multiply?");
        int amountOfNumbers = userInput.nextInt();
        int[] numbers = new int[amountOfNumbers];
        int result = 1;

        System.out.println("Now please insert " + amountOfNumbers + " numbers.");
        for (int i = 0; i < amountOfNumbers; i++) {
            numbers[i] = userInput.nextInt();
        }
        for (int num : numbers) {
            result = result * num;
        }
        return result;
    }
}

