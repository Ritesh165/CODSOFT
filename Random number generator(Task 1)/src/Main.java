import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        playGame();
    }

    public static void playGame() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNumber;
        int attempts = 0;
        int maxAttempts = 7;
        int userGuess;
        boolean userWantsToPlayAgain;

        do {
            randomNumber = random.nextInt(100) + 1;
            attempts = 0;

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess between 1 and 100: ");
                userGuess = scanner.nextInt();
                attempts++;

                if (userGuess == randomNumber) {
                    System.out.println("Congratulations! You guessed the correct number!");
                    break;
                } else if (userGuess > randomNumber) {
                    System.out.println("Your guess is too high. Try again.");
                } else {
                    System.out.println("Your guess is too low. Try again.");
                }
            }

            if (attempts == maxAttempts) {
                System.out.println("Sorry, you've reached the maximum number of attempts! The correct number was " + randomNumber + ".");
            }

            System.out.print("Do you want to play again? (yes/no): ");
            userWantsToPlayAgain = scanner.next().equalsIgnoreCase("yes");

        } while (userWantsToPlayAgain);

        scanner.close();
    }
}