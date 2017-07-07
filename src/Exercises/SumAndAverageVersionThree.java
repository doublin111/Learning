package Exercises;

/**
 * Created by Alex on 24-Mar-17.
 * This class calculates the sum of all the ODD numbers in a given number range
 * and then calculates the average of this sum
 */
public class SumAndAverageVersionThree {

    public static void main(String[] args) {

        int number = 1;                                      // this is the start of the number range
        int sum = 0;
        int count = 0;                                       // this variable counts how many numbers exist in the given range
        double average;

        while (number <= 100) {                             // calculate the sum of all the ODD numbers in the given range; also end of number range goes here
            if (number % 2 != 0) {
                sum += number;
            }
            number++;
            count++;
        }

        average = (double) sum / count;

        System.out.println("The sum is: " + sum);
        System.out.println("There are " + count + " numbers in the given range");
        System.out.println("The average is: " + average);
    }
}
