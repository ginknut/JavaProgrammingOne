package Chapter2;

import java.util.Scanner;

/**
 * Calculates volume and area from the inputs of length and radius given
 *
 * @author Eli Richardson
 */
public class C2_2 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius and length of a cylinder"); //Asks for a radius and length
        double radius = input.nextDouble(); //stores the first number given as a double variable named radius
        double length = input.nextDouble(); //stores the second number given as a double variable named length
        double area = radius * radius * 3.14159; //calulates area of a cylinder
        double volume = area * length; // calculates volume of a cylnder

        System.out.println("The area is " + area + " the volume is " + volume); //Prints the area and volume of a cylinder
    }
}
