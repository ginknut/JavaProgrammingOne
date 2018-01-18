package Chapter2;

import java.util.Scanner;

/**
 * Calculates the raw price, the tax, the total, and the tip for a meal, drink,
 * and dessert and displays it all.
 *
 * @author Eli Richardson
 */

public class P2 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the price of your meal, drink, and dessert"); //Ask to enter 3 numbers
        double meal = input.nextDouble(); //stores first number
        double drink = input.nextDouble(); //stores second number
        double dessert = input.nextDouble(); //stores third number
        double payment = meal + drink + dessert; //combines all three and stores it
        double tax = payment / 10; //calculates tax and stores it
        double subtotal = payment + tax; //calculates subtotal and stores it
        double tip = subtotal / 100 * 15; //calculates tip and stores it
        double total = subtotal + tip; //calculates total and stores it

        System.out.println("Your payment is " + payment + ", your tax is " + tax
                + ", your tip is " + tip + ", and you overall total is " + total);
    }   //Prints the payment, tax, tip, and overall total
}
