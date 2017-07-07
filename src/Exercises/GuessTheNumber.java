package Exercises;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Alex on 27-Mar-17.
 * <p>
 * In this program the computer picks a random number from 1 to 50,both inclusively,
 * then the user has to guess it. The program will let know the user if the number that
 * he picked is too low or to high.
 */
public class GuessTheNumber {

    public static boolean playAgain = true;

    public static void main(String[] args) {

        while (playAgain) {
            //put param for how many guess attempts should be taken
            playGame(5);
        }
    }

    private static void playGame(int maxGuessCount) {

        // generate the random number
        Random random = new Random();
        int randomNumber = random.nextInt(50) + 1;

        // track user guesses and set a limit
        int userGuess;
        int guessCount = 0;

        // INITIALIZE GAME

        // the number range is modified through param when calling method validateInput
        System.out.println("Please type a number between 1 and 50.");

        while (guessCount < maxGuessCount) {
            guessCount++;
            // put param for lowest and highest number range
            userGuess = validateInput(1, 50);

            if (userGuess == randomNumber) {
                System.out.println("That's right, you won!");
                break;
            }
            if (userGuess < randomNumber) {
                System.out.println("Nope, try something higher." + "\n");
                continue;
            } else if (userGuess > randomNumber) {
                System.out.println("Nope, try something lower." + "\n");
                continue;
            }
        }

        // decide if game should restart or not
        System.out.println("\n" + "Would you like to start over?" + "\n" + "1. Yes" + "\n" + "2. No");
        int playAgainOrNot = validateInput(1, 2);

        switch (playAgainOrNot) {
            case 1:
                playAgain = true;
                break;
            case 2:
                System.out.println("Ok, see you next time.");
                playAgain = false;
                break;
        }

    }

    private static int validateInput(int lowest, int highest) {

        Scanner input = new Scanner(System.in);
        int number;

        for (; ; ) {
            if (!input.hasNextInt()) {
                System.out.println("That's not a number, please try again.");
                input.next();
                continue;
            }
            number = input.nextInt();
            if (!(number >= lowest && number <= highest)) {
                System.out.println("The number is out of range, please try again.");
                continue;
            } else {
                System.out.println();
            }
            break;
        }
        return number;
    }
}





