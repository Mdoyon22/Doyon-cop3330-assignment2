/**
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Michael Doyon
 */


package ex32;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Random;

public class App
{
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        System.out.println("Let's play Guess the Number!\n");

        int difficulty, randNum = 0;
        final int diff1min = 1, diff1max = 10, diff2min = 1, diff2max = 100, diff3min = 1, diff3max = 1000;
        boolean keepPlaying = true;

        while (keepPlaying)
        {
            System.out.print("Enter the difficulty level (1, 2, or 3): ");
            difficulty = inp.nextInt();

            if (difficulty == 1)
                randNum = randInRange(diff1min, diff1max);
            else if (difficulty == 2)
                randNum = randInRange(diff2min, diff2max);
            else if (difficulty == 3)
                randNum = randInRange(diff3min, diff3max);

            System.out.print("I have my number. What's your guess? ");

            int guessCount = 0, guess = 0;

            while (guess != randNum) {
                try {
                    guess = inp.nextInt();
                    guessCount++;

                    if (guess < randNum)
                        System.out.print("Too low. Guess again: ");
                    else if (guess > randNum)
                        System.out.print("Too high. Guess again: ");
                    else {
                        System.out.print(String.format("You got it in %d guesses!\n", guessCount));
                        break;
                    }
                } catch (InputMismatchException e) {
                    guessCount++;
                }
            }

            System.out.print("\nDo you wish to play again (Y/N)? ");
            String response = inp.next();

            boolean playAgainStatus = verifyPlayAgain(response);

            if (playAgainStatus)
                continue;
            else if (!playAgainStatus)
                break;
        }
    }

    public static int randInRange(int min, int max)
    {
        Random r = new Random();
        return r.nextInt(max - min) + min;
    }

    public static boolean verifyPlayAgain(String response)
    {
        if (response.charAt(0) == 'y')
            return true;
        else if (response.charAt(0) == 'n')
            return false;

        return false;
    }
}

