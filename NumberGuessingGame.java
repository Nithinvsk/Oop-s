package JavaOops;
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int lowerBound = 1;     // You can customize the range
        int upperBound = 100;
        int numberToGuess = rand.nextInt(upperBound - lowerBound + 1) + lowerBound;
        int guessCount = 0;
        int guess;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Guess a number between " + lowerBound + " and " + upperBound);

        while (true) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            guessCount++;

            if (guess < numberToGuess) {
                System.out.println("Too low. Try again!");
            } else if (guess > numberToGuess) {
                System.out.println("Too high. Try again!");
            } else {
                System.out.println("Congratulations! You guessed the number in " + guessCount + " attempts.");
                break;
            }
        }
        scanner.close();
    }
}
