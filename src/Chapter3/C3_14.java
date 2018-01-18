package Chapter3;

import java.util.Scanner;

/**
 * The code generates a random number, 0 or 1, then asks the user to input 0 or
 * 1. If the numbers match then you win, if they don't you lose. Displays
 * results.
 *
 * @author Eli Richardson
 */
public class C3_14 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

        int number1 = (int) (Math.random() * 2);

        Scanner input = new Scanner(System.in);

        System.out.print("Choose a number: 0 or 1: ");

        int number2 = input.nextInt();

        if (number2 != number1) {
            System.out.println("YOU LOSE");
        } else {
            System.out.println("YOU WIN");
        }
    }
}
