import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        int numberToGuess = rand.nextInt(100) + 1; // Random number between 1 and 100
        int guess;
        int attempts = 0;

        System.out.println("🎯 Welcome to the Number Guessing Game!");
        System.out.println("I've picked a number between 1 and 100. Try to guess it!");

        do {
            System.out.print("Enter your guess: ");
            guess = in.nextInt();
            attempts++;

            if (guess > numberToGuess) {
                System.out.println("Too high! Try a smaller number.");
            } else if (guess < numberToGuess) {
                System.out.println("Too low! Try a bigger number.");
            } else {
                System.out.println("🎉 Correct! You guessed it in " + attempts + " attempts!");
            }
        } while (guess != numberToGuess);

        in.close();
    }
}
