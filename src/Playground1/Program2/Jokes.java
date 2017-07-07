package Playground1.Program2;

import Playground1.Program1.InputUtility;

public class Jokes {

    public static void main(String[] args) {

        System.out.println("Hello. Would you like to hear a joke or add new ones to the database? \n1. Give me a joke! \n2. Add a new joke \n3. Quit.");

        int selection = InputUtility.validateRange(1, 3);

        if (selection == 1) {
            RandomJokes.game();
        } else if (selection == 2) {
            InsertJokes.game();
        } else /*if (selection == 3)*/ {
            System.out.println("Ok, bye bye!");
        }
    }
}
