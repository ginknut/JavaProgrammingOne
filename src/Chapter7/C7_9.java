package Chapter7;

import java.util.*;

/**
 * Asks the user to enter 10 numbers and finds the least to print.
 *
 * @author Eli Richardson
 */
public class C7_9 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter ten numbers:\t");
        double numbers[] = new double[10];
        numbers[0] = input.nextDouble();
        numbers[1] = input.nextDouble();
        numbers[2] = input.nextDouble();
        numbers[3] = input.nextDouble();
        numbers[4] = input.nextDouble();
        numbers[5] = input.nextDouble();
        numbers[6] = input.nextDouble();
        numbers[7] = input.nextDouble();
        numbers[8] = input.nextDouble();
        numbers[9] = input.nextDouble();

        double least = numbers[0];
        for (int i = 0; i < 10; i++) {
            if (numbers[i] < least) {
                least = numbers[i];
            }
        }
        System.out.printf("The minimum number is: " + least);
    }
}
