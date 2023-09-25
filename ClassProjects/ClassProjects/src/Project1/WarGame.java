package Project1;

import java.util.Random;
import java.util.Scanner;

public class WarGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Enter the number of cards for each player (1 to 26): ");
        int inumOfCards = sc.nextInt();
        while(inumOfCards < 1 || inumOfCards > 26) {
            System.out.print("Invalid input. Please enter a number between 1 and 26: ");
            inumOfCards = sc.nextInt();
        }

        int[] player1 = new int[inumOfCards];
        int[] player2 = new int[inumOfCards];

        for (int i = 0; i < inumOfCards; i++) {
            player1[i] = rand.nextInt(27);
            player2[i] = rand.nextInt(27);
        }

        int player1Wins = 0;
        int player2Wins = 0;

        for (int i = 0; i < 5; i++) {
            player1[i] = rand.nextInt(27);  // random number
            player2[i] = rand.nextInt(27);
        }

        for (int i = 0; i < player1.length; i++) {
            System.out.println("Round " + (i + 1) + ":");
            System.out.println("Player 1: " + player1[i] + ", Player 2: " + player2[i]);

            if (player1[i] > player2[i]) {
                System.out.println("Player 1 wins!");
                player1Wins++;
            } else if (player1[i] < player2[i]) {
                System.out.println("Player 2 wins!");
                player2Wins++;
            } else {
                System.out.println("It's a tie!");
            }
            System.out.println();
        }

        if (player1Wins > player2Wins) {
            System.out.println("Player 1 wins the game!");
        } else if (player1Wins < player2Wins) {
            System.out.println("Player 2 wins the game!");
        } else {
            System.out.println("The game is a tie!");
        }
    }
}

