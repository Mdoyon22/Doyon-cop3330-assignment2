/**
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Michael Doyon
 */

package ex29;
import java.util.Scanner;
import static java.lang.Math.ceil;

public class App
{
    public static void main(String[] args)
    {
        double rateOfReturn = rateOfReturn();
        int years = calculateYears(rateOfReturn);
        System.out.print("It will take " + years + " years to double your initial investment.");
    }

    public static double rateOfReturn()
    {
        Scanner in = new Scanner(System.in);
        double rate = 0.0;
        boolean fail;
        do
        {
            System.out.print("What is the rate of return? ");
            String input = in.nextLine();
            try
            {
                rate = Double.parseDouble(input);
                if (rate > 0)
                {
                    fail = false;
                }
                else
                {
                    System.out.println("Sorry. That is not a valid input.");
                    fail = true;
                }
            }
            catch (NumberFormatException e)
            {
                System.out.println("Sorry. That is not a valid input.");
                fail = true;
            }
        }
        while(fail);

        return rate;
    }

    public static int calculateYears(double rateOfReturn)
    {
        return (int) ceil(72.0/rateOfReturn);
    }
}
