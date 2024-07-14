import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to the Number Guessing Game!");

        // Set the range of numbers
        System.out.print("Enter the minimum number: ");
        int minNumber = scanner.nextInt();
        System.out.print("Enter the maximum number: ");
        int maxNumber = scanner.nextInt();

        // Generate a random number within the specified range
        int randomNumber = random.nextInt(maxNumber - minNumber + 1) + minNumber;

        // Set the number of attempts
        System.out.print("Enter the number of attempts you want: ");
        int maxAttempts = scanner.nextInt();

        System.out.println("Guess a number between " + minNumber + " and " + maxNumber + ". You have " + maxAttempts + " attempts.");

        int attempts = 0;
        boolean guessedCorrectly = false;

        while (attempts < maxAttempts) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            attempts++;

            if (guess == randomNumber) {
                guessedCorrectly = true;
                break;
            } else if (guess < randomNumber) {
                System.out.println("Too low!");
            } else {
                System.out.println("Too high!");
            }
        }

        if (guessedCorrectly) {
            System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
        } else {
            System.out.println("Sorry, you've used all your attempts. The correct number was " + randomNumber + ".");
        }

        scanner.close();
    }
}
