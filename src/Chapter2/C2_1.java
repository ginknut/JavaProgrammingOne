package Chapter2;

import java.util.Scanner;

/**
 * Receives an input and converts it into from Celsius to Fahrenheit
 *
 * @author Eli Richardson
 */
public class C2_1 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number for Celsius"); // Asks for a number
        double Celsius = input.nextDouble(); //Stores number into a double variable
        double Fahrenheit = (9.0 / 5) * Celsius + 32; //Calculates Celsius to Fahrenheit

        System.out.println("The temperature for Celsius to Fahrenheit " + Celsius + " is "
                + Fahrenheit); //Prints the calculation
    }
}
