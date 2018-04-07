/*
  This program lets the user play HighLow, a simple card game
  that is described in the output statements at the beginning of
  the main() routine. After the user plays several games,
  the user’s average score is reported.
 */

package Playground1.Program4;

import Playground1.Program1.InputUtility;

import java.util.concurrent.ThreadLocalRandom;

public class HighOrLow {

    public static void main(String[] args) {

        System.out.println("This program lets you play the simple card game,\n" +
                "        HighLow. A card is dealt from a deck of cards.\n" +
                "        You have to predict whether the next card will be\n" +
                "        higher or lower. Your score in the game is the\n" +
                "        number of correct predictions you make before\n" +
                "        you guess wrong.\n");

        int gamesPlayed = 0;                    // number of games that the user has played.
        int sumOfScores = 0;                    // the sum of all the scores the user has played.
        double averageScore = 0;                // the average score computed by dividing sumOfScores by gamesPlayed.
        boolean playAgain;                  // restart or not the game.


        do {

            gamesPlayed++;

            int userCardRandomValue = ThreadLocalRandom.current().nextInt(1, 14);
            int userCardRandomSuit = ThreadLocalRandom.current().nextInt(0, 4);

            int drawnCardRandomValue = ThreadLocalRandom.current().nextInt(1, 14);
            int drawnCardRandomSuit = ThreadLocalRandom.current().nextInt(0, 4);


            Card userCard = new Card(userCardRandomValue, userCardRandomSuit);
            Card drawnCard = new Card(drawnCardRandomValue, drawnCardRandomSuit);

            int userGuess;
            int userMenu;

            System.out.println("You received this card: " + userCard.toString());
            System.out.print("Will the next card be higher or lower? ");
            System.out.println("\n 1.Higher \n 2.Lower");
            userGuess = InputUtility.validateRange(1, 2);
            System.out.println("The card that was drawn is: " + drawnCard.toString());


            if (userCard.getValue() == drawnCard.getValue()) {
                System.out.println("You got the same card as the deck so you lost.");

            } else if (userCard.getValue() < drawnCard.getValue()) {
                if (userGuess == 1) {
                    System.out.println("Good job, the card was higher.");
                    sumOfScores++;
                } else System.out.println("Your prediction was incorrect.");
            } else {
                if (userGuess == 2) {
                    System.out.println("Good job, the card was lower.");
                    sumOfScores++;
                } else System.out.println("Your prediction was incorrect.");
            }

            System.out.println("Do you wish to start over? \n 1.Yes \n 2.No");
            userMenu = InputUtility.validateRange(1, 2);
            if (userMenu == 1) playAgain = true;
            else playAgain = false;
        }
        while (playAgain);
    }
}
