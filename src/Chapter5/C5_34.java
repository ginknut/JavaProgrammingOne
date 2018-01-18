package Chapter5;

import java.util.Scanner;

/**
 * Reads the users input (0, 1, or 2) and randomly generates a number (0, 1, or
 * 2) to compare. Then it sets the numbers to either rock paper scissors. First
 * one to 3 points wins.
 *
 * @author Eli Richardson
 */
public class C5_34 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int computerGuess, playerGuess;
        int computerCount = 0, playerCount = 0;

        do {
            System.out.print("Enter 0, 1, or 2: ");
            playerGuess = input.nextInt();
            computerGuess = (int) (Math.random() * 3);

            switch (playerGuess) {
                case 0:
                    if (computerGuess == 0) {
                        System.out.println("The computer is scissor. You are scissor. It's a tie.");
                    }
                    if (computerGuess == 1) {
                        System.out.println("The computer is rock. You are scissor. You lost.");
                        computerCount++;
                    }
                    if (computerGuess == 2) {
                        System.out.println("The computer is paper. You are scissor. You won.");
                        playerCount++;
                    }
                    break;

                case 1:
                    if (computerGuess == 0) {
                        System.out.println("The computer is scissor. You are rock. You won.");
                        playerCount++;
                    }
                    if (computerGuess == 1) {
                        System.out.println("The computer is rock. You are rock. It's a tie.");
                    }
                    if (computerGuess == 2) {
                        System.out.println("The computer is paper. You are rock. You lost.");
                        computerCount++;
                    }
                    break;

                case 2:
                    if (computerGuess == 0) {
                        System.out.println("The computer is scissor. You are paper. You lost.");
                        computerCount++;
                    }
                    if (computerGuess == 1) {
                        System.out.println("The computer is rock. You are paper. You won.");
                        playerCount++;
                    }
                    if (computerGuess == 2) {
                        System.out.println("The computer is paper. You are paper. It's a tie.");
                    }
                    break;
            }

        } while (playerCount < 2 && computerCount < 2);

    }
}
