package Chapter7;

import java.util.*;

/**
 * Asks the users to enter numbers and the computer puts the numbers into an
 * array and finds the average of the numbers.
 *
 * @author Eli Richardson
 */
public class P7 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numbers[];

        System.out.print("How many numbers?\t");
        int size = input.nextInt();
        numbers = new int[size];

        System.out.print("Enter " + numbers.length + " numbers\t");

        input(numbers, size);
        average(numbers, size);

        System.out.println("The average is " + average(numbers, size));
        System.out.println("The contents of the array " + Arrays.toString(numbers));
    }

    /**
     * Method that puts the inputs into an array
     *
     * @param numbers
     * @param size
     */
    public static void input(int numbers[], int size) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

    }

    /**
     * Method that finds the average of the inputs
     *
     * @param numbers
     * @param size
     * @return
     */
    public static double average(int numbers[], double size) {

        double ave = 0;
        for (int i = 0; i < numbers.length; i++) {
            ave += numbers[i];
        }
        ave = (ave / size);

        return ave;
    }
}
