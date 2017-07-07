package Playground1.Program1;

public class Calculator {

    public static void main(String[] args) {

        int selection;
        boolean startOver;

        do {
            System.out.println("Welcome. This program allows you to do basic calculations.Please type the number of the calculation that you need: "
                    + "\n" + "1. Sum " + "\n" + "2. Subtract " + "\n" + "3. Multiply " + "\n" + "4. Division " + "\n" + "5. Remainder" + "\n" + "6. Percentage");

            selection = InputUtility.validateRange(1, 6);
            Switcher.chooseMenu(selection);

            System.out.println("Would you like to start over?" + "\n" + "1. Yes" + "\n" + "2. No");

            selection = InputUtility.validateRange(1, 2);
            if (selection == 1) startOver = true;
            else {
                System.out.println("Ok, bye bye!");
                startOver = false;
            }
        } while (startOver);
    }
}