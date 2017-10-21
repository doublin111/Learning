package Playground1.Program1;

import java.text.DecimalFormat;

class Switcher {

    static void chooseMenu(int selection) {

        double firstNumber;
        double secondNumber;

        DecimalFormat df = new DecimalFormat("#.###");

        switch (selection) {

            case 1:
                System.out.println("Sum");

                System.out.println("Please pick the first number: ");
                firstNumber = InputUtility.validateIfDouble();

                System.out.println("Please pick the second number: ");
                secondNumber = InputUtility.validateIfDouble();

                System.out.println("The result is: " + df.format(firstNumber + secondNumber) + "\n");
                break;

            case 2:
                System.out.println("Subtract");

                System.out.println("Please pick the first number: ");
                firstNumber = InputUtility.validateIfDouble();

                System.out.println("Please pick the second number: ");
                secondNumber = InputUtility.validateIfDouble();

                System.out.println("The result is: " + df.format(firstNumber - secondNumber) + "\n");
                break;

            case 3:
                System.out.println("Multiply");

                System.out.println("Please pick the first number: ");
                firstNumber = InputUtility.validateIfDouble();

                System.out.println("Please pick the second number: ");
                secondNumber = InputUtility.validateIfDouble();

                System.out.println("The result is: " + df.format(firstNumber * secondNumber) + "\n");
                break;

            case 4:
                System.out.println("Division");

                System.out.println("Please pick the first number: ");
                firstNumber = InputUtility.validateIfDouble();

                System.out.println("Please pick the second number: ");
                secondNumber = InputUtility.validateIfDouble();

                System.out.printf("The result is: " + df.format(firstNumber / secondNumber) + "\n");
                break;

            case 5:
                System.out.println("Remainder");

                System.out.println("Please pick the first number: ");
                firstNumber = InputUtility.validateIfDouble();

                System.out.println("Please pick the second number: ");
                secondNumber = InputUtility.validateIfDouble();

                System.out.println("The result is: " + df.format(firstNumber % secondNumber) + "\n");
                break;

            case 6:
                System.out.println("Percentage");

                System.out.println("Please pick the first number: ");
                firstNumber = InputUtility.validateIfDouble();

                System.out.println("Please pick the second number: ");
                secondNumber = InputUtility.validateIfDouble();

                System.out.println("The result is: " + df.format((firstNumber * 100) / secondNumber) + "%" + "\n");
                break;
        }
    }
}
