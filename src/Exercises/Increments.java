package Exercises;

/**
 * Created by Alex on 26-Mar-17.
 */
public class Increments {

    public static void main(String[] args) {

        int x = 10;

        System.out.print("The variable x value is: " + x + " (it should be 10");

        x++;
        System.out.println("After using x++ expression the value becomes: " + x + " (it should be 11)");

        ++x;
        System.out.println("After using ++x expression the value becomes: " + x + " (it should be 12)");

        x = x++;
        System.out.println("After using x = x++ expression the value becomes: " + x + " (it should be 13)");

        x = ++x;
        System.out.println("After using x = ++x expression the value becomes: " + x + " (it should be 13)");
    }
}
