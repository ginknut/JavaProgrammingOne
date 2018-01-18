package Chapter5;

import java.util.Scanner;

/**
 * Asks to input a string then reverses it.
 *
 * @author Eli Richardson
 */
public class C5_46 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = input.nextLine();
        System.out.printf("The reversed string is %s", (new StringBuffer(s).reverse().toString()));
    }
}
