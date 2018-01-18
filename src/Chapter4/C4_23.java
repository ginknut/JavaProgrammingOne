package Chapter4;

import java.util.Scanner;

/**
 * The program asks the name if the employee, how many hours they worked, and their hourly
 * pay. Then it will ask what is the federal tax withholding rate and the state tax 
 * withholding rate. It will calculate all of those numbers and print out the name, hours
 * worked, hourly pay, gross pay, total deductions, tax withholdings, and the net pay.
 *
 * @author Eli Richardson
 */

public class C4_23 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter employee's name: ");
        String name = input.next();

        System.out.print("Enter number of hours worked in a week: ");
        double hours = input.nextDouble();
        System.out.print("Enter hourly pay rate: ");
        double pay = input.nextDouble();

        System.out.print("Enter federal tax withholding rate: ");
        double federalTax = input.nextDouble();

        System.out.print("Enter state tax withholding rate: ");
        double stateTax = input.nextDouble();

        double gross = (hours * pay);
        double federalWithholding = (gross * federalTax);
        double stateWithholding = (gross * stateTax);
        double deduction = (stateWithholding + federalWithholding);
        double net = (gross - deduction);

        System.out.printf("\nEmployee's Name: %s", name);
        System.out.printf("\nHours Worked: %.2f", hours);
        System.out.printf("\nPay Rate: $%.2f", pay);
        System.out.printf("\nGross Pay: $%.2f", gross);
        System.out.println("\nDeductions:\n ");
        System.out.printf("\nFederal Withholding(%.2f%%): $%.2f", (federalTax * 100), federalWithholding);
        System.out.printf("\nState Withholding(%.2f%%): $%.2f", (stateTax * 100), stateWithholding);
        System.out.printf("\nTotal Deductions: $%.2f", deduction);
        System.out.printf("\nNet Pay: $%.2f", net);
    }
}
