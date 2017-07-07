package Exercises;

/**
 * Created by Alex on 27-Mar-17.
 *
 * This program prints a n by n pattern.
 * The program can use only two output statements, just one time each of them:
 * System.out.print("# "); and System.out.println();
 */
public class SquareBoard {

    public static void main(String[] args) {

        int n = 5;

        for(int row = 1; row <= n; row++) {
            for (int column = 1; column <= n; column++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }
}
