package Exercises;

/**
 * Created by Alex on 23-Mar-17.
 */
public class ScoreCalculator {

    public static void main(String[] args) {

        calcFeetAndInchesToCentimeters(6, -10);
        calcFeetAndInchesToCentimeters(13);
    }

    // Method overloading //

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {

        if (feet >= 0 && (inches >= 0 && inches <= 12)) {

            double centimeteres = ((feet * 12) * 2.54) + (inches * 2.54);
            System.out.println(feet + " feet and " + inches + " inches equals " + centimeteres + " centimeters");
            return centimeteres;
        }

        System.out.println("Invalid feet or inches parameter");
        return -1;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {

        if (inches >= 0) {

            double result = inches / 12;
            System.out.println(inches + " inches equals to " + result + " feet");
            return  result;
        }
        System.out.println("Invalid feet or inches parameter");
        return -1;
    }
}
