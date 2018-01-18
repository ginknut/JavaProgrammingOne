package Chapter3;

import java.util.Scanner;

/**
 * Asks user for the weight and price of package 1 and 2 then calculates which
 * one has a better weight to price ratio
 *
 * @author Eli Richardson
 */
public class C3_33 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a weight and a price for package 1: ");
        double weight1 = input.nextDouble();
        double price1 = input.nextDouble();
        System.out.print("Enter a weight and a price for package 2: ");
        double weight2 = input.nextDouble();
        double price2 = input.nextDouble();

        if ((weight1 / price1) < (weight2 / price2)) {
            System.out.println("Package 2 has a better price.");
        }

        if ((weight1 / price1) > (weight2 / price2)) {
            System.out.println("Package 1 has a better price.");
        }

        if ((weight1 / price1) == (weight2 / price2)) {
            System.out.println("The two packages have the same price.");
        }
    }
}
