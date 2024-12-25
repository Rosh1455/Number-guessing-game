import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("=== Welcome to the Number Guessing Game ===");
        System.out.println("I have selected a number between 1 and 100.");
        System.out.println("Can you guess it? Type your guess or '0' to quit!");

        // Generate a random number between 1 and 100
        int numberToGuess = random.nextInt(100) + 1;
        int userGuess = -1;
        int attempts = 0;

        while (userGuess != numberToGuess) {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();
            attempts++;

            if (userGuess == 0) {
                System.out.println("You quit the game. The number was " + numberToGuess + ".");
                break;
            }

            if (userGuess > numberToGuess) {
                System.out.println("Too high! Try again.");
            } else if (userGuess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                break;
            }
        }

        System.out.println("=== Thank you for playing! ===");
        scanner.close();
    }
}