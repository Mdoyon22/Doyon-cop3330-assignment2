/**
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Michael Doyon
 */


package ex37;
import java.util.Scanner;
import java.util.Random;

public class App
{
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        char[] specialChars = {'!', '@', '#', '$', '%', '^', '&', '*'};
        char[] digits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        System.out.print("What's the minimum length? ");
        int minlen = inp.nextInt();
        System.out.print("How many special characters? ");
        int specialCharCount = inp.nextInt();
        System.out.print("How many numbers? ");
        int numsCount = inp.nextInt();

        char[] password = new char[minlen];

        fillwithLetters(password, letters);
        IntegrateRandNums(password, digits, numsCount);
        IntergrateRandSpecialChars(password, specialChars, specialCharCount);

        System.out.print(createFinalPasswordDisplay(password));
    }

    public static void fillwithLetters(char[] emptyPassword, char[] letters)
    {
        Random rand = new Random();

        for (int i = 0; i < emptyPassword.length; i++)
            emptyPassword[i] = letters[rand.nextInt(letters.length)];
    }

    public static void IntegrateRandNums(char[] password, char[] digits, int numsToAddCount)
    {
        Random rand = new Random();

        for (int i = 0; i < numsToAddCount; i++)
        {
            int RandIdx = rand.nextInt(password.length);

            if (Character.isDigit(password[RandIdx]))
                while (Character.isDigit(password[RandIdx]))
                    RandIdx = rand.nextInt(password.length);

                password[RandIdx] = digits[rand.nextInt(digits.length)];
        }
    }

    public static void IntergrateRandSpecialChars(char[] password, char[] specialChars, int specialCharsToAddCount)
    {
        Random rand = new Random();

        for (int i = 0; i < specialCharsToAddCount; i++)
        {
            int randIdx = rand.nextInt(password.length);

            if (Character.isDigit(password[randIdx]) || !Character.isLetterOrDigit(password[randIdx]))
                while (Character.isDigit(password[randIdx]) || !Character.isLetterOrDigit(password[randIdx]))
                    randIdx = rand.nextInt(password.length);

                password[randIdx] = specialChars[rand.nextInt(specialChars.length)];
        }
    }

    public static String createFinalPasswordDisplay(char[] password)
    {
        return String.format("The new password is %s", String.valueOf(password));
    }
}
