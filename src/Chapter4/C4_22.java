package Chapter4;

import java.util.Scanner;

/**
 * The program asks the user to enter two strings, if see if the second string is the
 * substring of string 1 or not.
 *
 * @author Eli Richardson
 */

public class C4_22 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String s1 = input.next();
        System.out.print("Enter the second string: ");
        String s2 = input.next();

        if (s1.contains(s2)) {
            System.out.printf("%s is a substring of %s", s2, s1);
        } else {
            System.out.printf("%s is not a substring of %s", s2, s1);
        }
    }
}
