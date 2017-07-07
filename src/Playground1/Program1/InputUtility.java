package Playground1.Program1;

import java.util.Scanner;

public final class InputUtility {

    private static Scanner input = new Scanner(System.in);

    public static double validateIfNumber() {

        double number;

        for (; ; ) {
            if (!input.hasNextDouble()) {
                System.out.println("That's not a number, please try again.");
                input.next();
                continue;
            }
            number = input.nextDouble();
            break;
        }
        return number;
    }

    public static int validateRange(int lowest, int highest) {

        int number;

        for (; ; ) {
            if (!input.hasNextInt()) {
                System.out.println("That's not a number, please try again.");
                input.next();
                continue;
            }
            number = input.nextInt();
            if (number < lowest || number > highest) {
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
