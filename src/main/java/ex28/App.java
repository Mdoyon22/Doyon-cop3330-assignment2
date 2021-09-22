/**
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Michael Doyon
 */

package ex28;
import java.util.Scanner;

public class App
{
    public static void main (String[] args)
    {
        int[] nums = collectNumbers();
        System.out.print(calcSum(nums));
    }

    public static int[] collectNumbers()
    {
        Scanner inp = new Scanner(System.in);
        int nums[] = new int[5];

        for (int i = 0; i < nums.length; i++)
        {
            System.out.print("Enter a number: ");
            nums[i] = inp.nextInt();
        }

        return nums;
    }

    public static String calcSum(int[] nums)
    {
        int sum = 0;

        for (int i = 0; i < nums.length; i++)
            sum += nums[i];

        return createSumDisplay(sum);

    }

    private static String createSumDisplay(int sum)
    {
        return String.format("The total is %d.", sum);
    }
}
