/**
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Michael Doyon
 */


package ex38;
import java.util.Scanner;


public class App
{
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a list of numbers, separated by spaces: ");

        String[] splitNumChars = inp.nextLine().split(" ");
        int[] nums = new int[splitNumChars.length];

        for (int i = 0; i < nums.length; i++)
            nums[i] = Integer.parseInt(splitNumChars[i]);

        int[] filteredEvens = filterEvenNumbers(nums);
        printEvenNums(filteredEvens);
    }

    public static int[] filterEvenNumbers(int[] initial)
    {
        int evenCount = 0;

        for (int i = 0; i < initial.length; i++)
            if (initial[i] % 2 == 0)
                evenCount++;

            int[] filter = new int[evenCount];

            for (int i = 0, j = 0; i < initial.length; i++)
                if (initial[i] % 2 == 0)
                    filter[j++] = initial[i];

                return filter;
    }

    private static void printEvenNums(int[] filterEvens) {
        System.out.print("The even numbers are");

        for (int i = 0; i < filterEvens.length; i++) {
            System.out.print(String.format(" %d", filterEvens[i]));

            if (i == filterEvens.length - 1)
                System.out.print(".");
        }
    }
}
