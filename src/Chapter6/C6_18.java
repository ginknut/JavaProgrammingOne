package Chapter6;

import java.util.Scanner;

/**
 * User inputs a password and the code checks if it's the right length and there
 * are at least 2 digits.
 *
 * @author Eli Richardson
 */
public class C6_18 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a valid password: ");

        String password = input.next();
        int invalid = 0;
        int count = 0;

        for (int i = 0; i < password.length(); i++) {
            if (Character.isLetterOrDigit(password.charAt(i))) {
                while (i < password.length()) {
                    if (Character.isDigit(password.charAt(i))) {
                        ++count;
                        i++;
                    } else {
                        System.out.println("\nInvalid Password, try again: ");
                    }
                }
            }
        }

    }
}
