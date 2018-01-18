package Chapter3;

import java.util.Scanner;

/**
 * The program asks the user to to enter two numbers. Then it compares the two
 * numbers and checks which one is less than, more than, less than or equal to,
 * more than or equal to, or equal to the other. It also checks if it is
 * divisible by zero, a proper or improper fraction, and if it is in between 1
 * and 100 (in range or out of range). Then it gives it a letter grade.
 *
 * @author Eli Richardson
 */
public class P3 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter two numbers: ");

        double number1 = input.nextDouble();
        double number2 = input.nextDouble();

        if (number1 < number2) {
            System.out.println("The first number is less than the second.");
        }

        if (number1 > number2) {
            System.out.println("The first number is greater than the second.");
        }

        if (number1 == number2) {
            System.out.println("The first number is equal to the second.");
        }

        if (number1 <= number2) {
            System.out.println("The first number is less than or equal to the second.");
        }

        if (number1 != number2) {
            System.out.println("The first number is not equal to the second.");
        }

        if (number2 == 0) {
            System.out.println("Cannot divide by zero.");
        } else if (number1 / number2 < 1) {
            System.out.println("Proper Fraction.");
        } else {
            System.out.println("Improper Fraction.");
        }

        if (number1 >= 90) {
            System.out.println("A");
        } else if (number1 >= 80) {
            System.out.println("B");
        } else if (number1 >= 70) {
            System.out.println("C");
        } else if (number1 >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }

        if (1 < number2 && number2 < 100) {
            System.out.println("In Range.");
        } else {
            System.out.println("Out of Range.");
        }
    }
}
