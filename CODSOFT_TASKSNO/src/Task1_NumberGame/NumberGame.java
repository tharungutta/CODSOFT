package Task1_NumberGame;

import java.util.Random;
import java.util.Scanner;

public class NumberGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int score = 0;
        String playAgain;

        do {
            int number = random.nextInt(100) + 1;
            int guess = 0;
            int attempts = 0;
            int maxAttempts = 7;

            System.out.println("\n===== NUMBER GUESSING GAME =====");
            System.out.println("Guess a number between 1 and 100");
            System.out.println("You have 7 attempts.");

            while (attempts < maxAttempts) {

                System.out.print("Enter your guess: ");
                guess = sc.nextInt();
                attempts++;

                if (guess == number) {
                    System.out.println("Congratulations! Correct guess.");
                    System.out.println("Attempts: " + attempts);
                    score++;
                    break;
                }
                else if (guess < number) {
                    System.out.println("Too low! Try again.");
                }
                else {
                    System.out.println("Too high! Try again.");
                }
            }

            if (attempts == maxAttempts && guess != number) {
                System.out.println("Game Over!");
                System.out.println("Correct number was: " + number);
            }

            System.out.println("Your score: " + score);

            System.out.print("Do you want to play again? (yes/no): ");
            playAgain = sc.next();

        } while (playAgain.equalsIgnoreCase("yes"));

        System.out.println("Thanks for playing!");
        sc.close();
    }
}
