package Chapter5;

import java.util.Scanner;

/**
 * Reads votes and outputs the number of yes, no, and invalid votes and then the
 * total at the end.
 *
 * @author Eli Richardson
 */

public class P5 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int yes = 0;
        int no = 0;
        int invalid = 0;
        int total = 0;
        String a;
        char b = 0;
        while (b != 'Q') {

            System.out.print("Enter \"Y\" to vote yes, \"N\" to vote no, or \"Q\" to quit voting:  ");
            a = input.next().toUpperCase();
            b = a.charAt(0);
            if (b == 'Y') {
                yes++;
            }
            if (b == 'N') {
                no++;
            }
            if (b != 'Y' && b != 'N' && b != 'Q') {

                System.out.print("Invalid Input");
                invalid++;
            }
            total++;
        }

        System.out.println("Yes Votes:        " + yes);
        System.out.println("No Votes:         " + no);
        System.out.println("Invalid Votes:    " + invalid);
        System.out.println("Total Votes:      " + total);
    }
}
