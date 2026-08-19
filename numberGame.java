import java.util.Random;
import java.util.Scanner;

public class numberGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int secretNumber = random.nextInt(100) + 1;

        int guess;
        int attempts = 0;

        System.out.println("===== NUMBER GAME =====");
        System.out.println("I have selected a number between 1 and 100.");
        System.out.println("Try to guess it!");

        while (true) {

            System.out.print("Enter your guess: ");
            guess = sc.nextInt();

            attempts++;

            if (guess < secretNumber) {
                System.out.println("Too low! Try again.");

            } else if (guess > secretNumber) {
                System.out.println("Too high! Try again.");

            } else {
                System.out.println("Congratulations!");
                System.out.println("You guessed the correct number.");
                System.out.println("Number of attempts: " + attempts);
                break;
            }
        }

        sc.close();
    }
}