package Exercises;

/**
 * Created by Alex on 24-Mar-17.
 *
 * This class calculates the sum of all the numbers in a given range
 * and then calculates the average of this sum
 */
public class SumAndAverage {

    public static void main(String[] args) {

        int number = 1;
        int sum = 0;
        int count = 0;                                       // this variable shows how many numbers exist in the given range
        double average;

        while (number <= 10) {                             //calculate the sum of all the numbers in the given range
            sum += number;
            number++;
            count++;
        }

        average = (double) sum / count;

        System.out.println("The sum is: " + sum);
        System.out.println("There are " + count + " numbers in the given range");
        System.out.println("The average is: " + average);
    }
}
