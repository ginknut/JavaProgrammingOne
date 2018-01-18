package Chapter6;

import java.util.Scanner;

/**
 * Converts dollar input amount from user to currency of the users choice.
 *
 * @author Eli Richardson
 */
public class P6 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many Euros a dollar would buy?  ");
        double euros = input.nextDouble();
        System.out.print("How many Pound Sterling a dollar would buy?  ");
        double sterling = input.nextDouble();
        System.out.print("How many Yen a dollar will buy?  ");
        double yen = input.nextDouble();
        String amount2 = "";

        do {
            System.out.print("Enter the number of dollars:  ");
            double dollars = input.nextDouble();
            System.out.print("Enter \"E\" to buy Euros, \"P\" to buy Pounds, or \"Y\" to buy Yen:  ");
            String amount = input.next().toUpperCase();

            switch (amount) {
                case "E":
                    double e = convert(dollars, euros);
                    System.out.printf("For %.2f dollars, you will get %.2f Euros", dollars, e);
                    break;

                case "P":
                    double p = convert(dollars, sterling);
                    System.out.printf("For %.2f dollars, you will get %.2f Pounds", dollars, p);
                    break;

                case "Y":
                    double y = convert(dollars, yen);
                    System.out.printf("For %.2f dollars, you will get %.2f Yen", dollars, y);
                    break;
            }
            do {
                System.out.print("\nAnything else you want you buy?  ");
                amount2 = input.next();
            } while (!amount2.equals("no") && !amount2.equals("yes"));
        } while (!amount2.equals("no"));
    }

    /**
     * Method used to convert dollars to currency of choice.
     *
     * @param dollars input from user
     * @param currency currency of users choice
     * @return converted currency
     */
    public static double convert(double dollars, double currency) {

        if (dollars > 100) {
            dollars -= dollars * 0.05;
        } else {
            dollars -= dollars * 0.10;
        }

        return dollars * currency;
    }
}
