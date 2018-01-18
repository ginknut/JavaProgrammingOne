package Chapter3;

import java.util.Scanner;

/**
 * Asks for an input and figures out if the number is divisible by 5, 6, or
 * both.
 *
 * @author Eli Richardson
 */
public class C3_26 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an Integer: ");

        int x = input.nextInt();

        if (x % 5 == 0 && x % 6 == 0) {
            System.out.println("Is " + x + "divisible by 5 and 6? true");
        } else {
            System.out.println("Is " + x + "divisible by 5 and 6? false");
        }
        if (x % 5 == 0 || x % 6 == 0) {
            System.out.println("Is " + x + "divisible by 5 or 6? true");
        } else {
            System.out.println("Is " + x + "divisible by 5 or 6? false");
        }
        if (x % 5 == 0 ^ x % 6 == 0) {
            System.out.println("Is " + x + "divisible by 5 or 6, but not both? true");
        } else {
            System.out.println("Is " + x + "divisible be 5 or 6, but not both? false");
        }
    }
}
