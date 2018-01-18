package Chapter4;

import java.util.Scanner;

/**
 * The program asks for information from bidder's 1 and 2 (like name, hours of work, and 
 * charge per hour). Then the program checks which one has the least bid depending on 
 * the hours and rate given or the least hours and chooses a winner. if both are equal
 * no one wins.
 * 
 * @author Eli Richardson
 */

public class P4 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bidder 1, what is your name?  ");
        String bidder1 = input.next();

        System.out.print("How many hours of work will you require?  ");
        int hours1 = input.nextInt();

        System.out.print("How much will you charge per hour?  ");
        double rate1 = input.nextDouble();

        System.out.println("Bidder 2, what is your name?  ");
        String bidder2 = input.next();

        System.out.print("How many hours of work will you require?  ");
        int hours2 = input.nextInt();

        System.out.print("How much will you charge per hour?  ");
        double rate2 = input.nextDouble();

        double cost1 = (hours1 * rate1);
        double cost2 = (hours2 * rate2);

        if (cost1 < cost2) {
            System.out.printf("\nThe winner is %s with a bid of %.2f!", bidder1, cost1);
        } else if (cost2 < cost1) {
            System.out.printf("\nThe winner is %s with a bid of %.2f!", bidder2, cost2);
        } else if (cost1 == cost2 && hours1 < hours2) {
            System.out.printf("\nThe winner is %s with a bid of %.2f and " + hours1 + " hours!", bidder1, cost1);
        } else if (cost1 == cost2 && hours2 < hours1) {
            System.out.printf("\nThe winner is %s with a bid of %.2f and " + hours2 + " hours!", bidder2, cost2);
        } else if (cost1 == cost2 && hours1 == hours2) {
            System.out.printf("\nThere is no winner. %s and %s has identical bids. %s had " + hours1
                    + " hours, a charge of %.2f per hour and a total cost of %.2f. %s had " + hours2
                    + " hours, a charge of %.2f per hour and a total cost of %.2f.", bidder1, bidder2, bidder1, rate1, cost1, bidder2, rate2, cost2);
        }
    }
}
