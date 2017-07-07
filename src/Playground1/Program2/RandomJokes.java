package Playground1.Program2;

import Playground1.Program1.InputUtility;

import java.util.Random;

class RandomJokes {

    static void game() {

        boolean playAgain;
        int selection;

        do {
            System.out.println("Funny joke incoming!" + "\nAre you ready?" + "\n1. Yes    2. No (Quit)");
            selection = InputUtility.validateRange(1, 2);

            if (selection == 1) {
                System.out.println(jokeGenerator() + "\n");
                playAgain = true;
            } else {
                System.out.println("Ok, quitting program.");
                playAgain = false;
            }
        } while (playAgain);
    }

    private static String jokeGenerator() {

        Random rnd = new Random();
        int randomNumber = rnd.nextInt(InsertJokes.getLastJokeNumber() + 1);
        return InsertJokes.getJoke(randomNumber);
    }
}
