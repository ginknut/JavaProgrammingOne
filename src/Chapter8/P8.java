package Chapter8;

import java.util.*;

/**
 * Asks the user for an employees ID, days worked, and hours worked. Then puts
 * all that information into an array and prints out a table.
 *
 * @author Eli Richardson
 */
public class P8 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String more = "";
        String identify = "";
        String day = "";
        double arRAY[][] = new double[4][5];
        do {
            do {
                System.out.print("Enter the salesman ID as A, B, C, or D.\t");
                identify = input.next().toUpperCase();
            } while (!identify.equals("A") && !identify.equals("B") && !identify.equals("C") && !identify.equals("D"));

            do {
                System.out.print("Enter the day as M, T, W, H, or F.\t");
                day = input.next().toUpperCase();
            } while (!day.equals("M") && !day.equals("T") && !day.equals("W") && !day.equals("H") && !day.equals("F"));

            System.out.print("Enter the amount of the sale.\t");
            double amount = input.nextDouble();

            do {
                System.out.print("More data? Enter Y for more or N to stop.\t");
                more = input.next().toUpperCase();
            } while (!more.equals("N") && !more.equals("Y"));
            id(arRAY, identify, day, amount);
        } while (!more.equals("N"));

        System.out.print("\n\nSalesman\tM\tT\tW\tH\tF");
        char identifyGuy = 'A';
        for (int r = 0; r < arRAY.length; r++) {
            System.out.print("\n    " + identifyGuy + "\t\t");
            identifyGuy++;
            for (int c = 0; c < arRAY[r].length; c++) {
                System.out.print(arRAY[r][c] + "\t");
            }
        }

    }

    /**
     * Method that puts the inputs into the correct array
     *
     * @param arRAY array of 4 rows and five columns
     * @param identify ID of employee
     * @param day day that employee worked
     * @param amount amount of sales for that day
     * @return total sale for the day
     */
    public static double id(double arRAY[][], String identify, String day, double amount) {

        int i = 0;
        int d = 0;
        switch (identify) {

            case "A":
                i = 0;
                break;
            case "B":
                i = 1;
                break;
            case "C":
                i = 2;
                break;
            case "D":
                i = 3;
                break;
        }
        switch (day) {

            case "M":
                d = 0;
                break;
            case "T":
                d = 1;
                break;
            case "W":
                d = 2;
                break;
            case "H":
                d = 3;
                break;
            case "F":
                d = 4;
                break;
        }

        return (arRAY[i][d] += amount);
    }
}
