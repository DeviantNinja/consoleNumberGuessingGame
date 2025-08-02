import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);

        int number = rand.nextInt(101);
        int guessedNumber;
        int guessCount = 0;
        int numberOfTries = 10;
        boolean gameOver = false;

        System.out.printf("you have %d tries to guess the number\n",numberOfTries);
        while(!gameOver && guessCount < numberOfTries) {
            guessCount++;
            System.out.print("Guess a number between 1 and 100: ");

            while(!input.hasNextInt()) {
                System.out.print("Invalid Entry, Guess Again!");
                input.next();
            }

            guessedNumber = input.nextInt();
            if(guessedNumber == number) {
                System.out.println("Congratulations you guessed the number!");
                System.out.printf("it took you %d tries.\n",guessCount);
                gameOver = true;
                break;
            }
            System.out.printf("Incorrect Number. Your guess was %s !\n", guessedNumber > number ? "to high" : "to low");
        }

        if(!gameOver) {
            System.out.printf("You exceeded the number of guesses the number was %d",  number);
        }
    }
}
