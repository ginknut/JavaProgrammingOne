package Chapter8;

/**
 * Prints the number of employees how many numbers they've worked. Then the
 * hours are summed up and printed
 *
 * @author er1001800
 */
public class C8_4 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

        System.out.print("\t\tSu\tM\tT\tW\tTh\tF\tSa\tTotal\n");
        int[][] employees = {
            {2, 4, 3, 4, 5, 8, 8},
            {7, 3, 4, 3, 3, 4, 4},
            {3, 3, 4, 3, 3, 2, 2},
            {9, 3, 4, 7, 3, 4, 1},
            {3, 4, 5, 3, 6, 3, 8},
            {3, 4, 4, 6, 3, 4, 4},
            {3, 7, 4, 8, 3, 8, 4},
            {6, 3, 5, 9, 2, 7, 9}
        };

        for (int r = 0; r < employees.length; r++) {
            System.out.print("Employee " + r);
            for (int c = 0; c < employees[r].length; c++) {
                System.out.print("\t" + employees[r][c]);
            }
            System.out.println("\t" + sum(employees, r));
        }
    }

    /**
     * Method that finds the sum of the workers hours.
     *
     * @param employees
     * @param r
     * @return
     */
    public static int sum(int employees[][], int r) {
        int t = 0;
        for (int c = 0; c < employees[r].length; c++) {

            t += employees[r][c];
        }
        return t;
    }
}
