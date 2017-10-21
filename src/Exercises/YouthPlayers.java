package Exercises;

import Playground1.Program1.InputUtility;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class YouthPlayers {

    public static void main(String[] args) {

        System.out.println("Welcome. Please type how large the pool of players should be.");
        int poolSize = InputUtility.validateIfInt();
        generatePlayersPool(poolSize);
    }

    private static void generatePlayersPool(int poolSize) {

        DecimalFormat df = new DecimalFormat("#.###");
        boolean restart;

        int[] playersPool = new int[poolSize];

        for (int i = 0; i < poolSize; i++) {
            if (i <= (5 * poolSize / 100)) {
                playersPool[i] = ThreadLocalRandom.current().nextInt(5, 6 + 1);
            }
            if (i > (5 * poolSize / 100) && i <= (30 * poolSize / 100)) {
                playersPool[i] = ThreadLocalRandom.current().nextInt(3, 4 + 1);
            }
            if (i > (30 * poolSize / 100)) {
                playersPool[i] = ThreadLocalRandom.current().nextInt(1, 2 + 1);
            }
        }

        do {
            System.out.println("Do you want to draw a player? \n1. Yes. \n2. Multi \n3. No.");
            int selection = InputUtility.validateRange(1, 3);

            if (selection == 1) {
                System.out.println("The quality of the player you've draw is " + playersPool[ThreadLocalRandom.current().nextInt(poolSize)]);
                System.out.println("Would you like to start over? \n1. Yes \n2. No");
                selection = InputUtility.validateRange(1, 2);
                if (selection == 1) restart = true;
                else {
                    System.out.println("Ok, bye bye!");
                    restart = false;
                }

            }

            else if (selection == 2) {
                System.out.println("How many players? (The pool has " + poolSize + " players)");
                selection = InputUtility.validateRange(1, poolSize);
                int[] multiDraw = new int[selection];

                String highQuality = "";
                int highQualityCount = 0;

                String mediumQuality = "";
                int mediumQualityCount = 0;

                String poorQuality = "";
                int poorQualityCount = 0;

                for (int i = 0; i < selection; i++) {
                    multiDraw[i] = playersPool[ThreadLocalRandom.current().nextInt(poolSize)];
                    if (multiDraw[i] == 5 || multiDraw[i] == 6) {
                        highQuality.concat(Arrays.toString(multiDraw).concat(", "));
                        highQualityCount++;
                    }
                    if (multiDraw[i] == 3 || multiDraw[i] == 4) {
                        mediumQuality.concat(Arrays.toString(multiDraw).concat(", "));
                        mediumQualityCount++;
                    }
                    if (multiDraw[i] == 1 || multiDraw[i] == 2) {
                        poorQuality.concat(Arrays.toString(multiDraw).concat(", "));
                        poorQualityCount++;
                    }
                }
                System.out.println("These are the results: \nHigh quality players: " + highQualityCount + "(" + df.format((double)highQualityCount / (double) selection * 100) + " %)"  +
                        "\nMedium quality players: " + mediumQualityCount + "(" + df.format((double)mediumQualityCount / (double) selection * 100) + " %)" +
                        "\nPoor quality players: " + poorQualityCount+ "(" + df.format((double)poorQualityCount / (double) selection * 100) + " %)");
                System.out.println("Would you like to start over? \n1. Yes \n2. No");
                selection = InputUtility.validateRange(1, 2);
                if (selection == 1) restart = true;
                else {
                    System.out.println("Ok, bye bye!");
                    restart = false;
                }

            }

            else {
                System.out.println("Ok, bye bye!");
                restart = false;
            }
        } while (restart);
    }
}
