package Exercises;

/**
 * Created by Alex on 26-Mar-17.
 */
public class Product1ToN {

    public static void main(String[] args) {

        int numbers = 1;
        int product = 1;

        while (numbers <= 10) {
            product *= numbers;
            numbers++;
        }

        System.out.println("The result is: " + product);
    }
}
