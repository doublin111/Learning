package Exercises;

/**
 * Created by Alex on 24-Mar-17.
 *
 * This class calculates the sum of all the numbers between 1 and 100 in a different way than class SumAndAverage.
 * using a simple formula:
 * s = (n * (n +1)) / 2        --->    s is the sum of the series and n is the number of terms in the series, in this case, 100.
 */
public class SumAndAverageVersionTwo {

    public static void main(String[] args) {

        int n = 10;
        double average;

        int s = (n * (n +1)) / 2;

        System.out.println("The sum is: " + s);
    }
}
