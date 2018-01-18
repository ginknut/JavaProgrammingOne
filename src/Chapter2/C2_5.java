package Chapter2;

import java.util.Scanner;

/**
 * Calculates the gratuity rate and displays the gratuity rate and total
 *
 * @author Eli Richardson
 */
public class C2_5 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the subtotal and gratuity rate"); //Asks to give two numbers
        double subtotal = input.nextDouble(); //stores first number
        double gratuityRate = input.nextDouble(); //stores second number
        double gratuity = (gratuityRate / 100) * subtotal; //calculates the gratuity using the second number and store it
        double total = gratuity + subtotal; //calculates total and stores it

        System.out.println("The gratuity is " + gratuity + " and the total is " + total);
    }   //prtints gratuity and total

}
