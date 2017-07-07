package Exercises;

/**
 * Created by Alex on 26-Mar-17.
 * <p>
 * Compute the sum of harmonics series from left-to-right and right-to-left.
 */
public class HarmonicSum {

    public static void main(String[] args) {

        int maxDenominator = 50000;                                             // use this for left-to-right computation
        int minDenominator = 1;                                                 // use this for right-to-left computation
        double sumL2R = 0.0f;
        double sumR2L = 0.0f;

        // computation done from left-to-right
        for (int denominator = minDenominator; denominator <= maxDenominator; denominator++) {
            sumL2R += (double) 1 / denominator;
        }

        System.out.println("The result of the left-to-right computation is: " + sumL2R);

        //computation done from right-to-left
        for (int denominator = maxDenominator; denominator >= minDenominator; denominator--) {
            sumR2L += (double) 1 / denominator;
        }

        System.out.println("The result of the right-to-left computation is: " + sumR2L);

        // computation of the difference between left-to-right and right-to-left

        double difference = sumL2R - sumR2L;
        System.out.println("The difference between these two is: " + difference);
    }
}
