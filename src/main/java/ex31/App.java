/**
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Michael Doyon
 */


package ex31;
import java.util.Scanner;


public class App
{
    public static void main(String[] args)
    {
        double age = enterAge();
        double restingPulse = enterPulse();
        String showInput = String.format("Resting Pulse: %s \t\tAge: %s\n", (int) restingPulse, (int) age);
        System.out.println(showInput);
        String output = generateOutput(restingPulse, age);
        System.out.println(output);
    }

    public static double enterPulse()
    {
        Scanner in = new Scanner(System.in);
        double rate = 0.0;
        boolean fail;
        do
        {
            System.out.print("Please enter your resting pulse: ");
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

        while (fail);

        return rate;
    }

    public static double enterAge()
    {
        Scanner in = new Scanner(System.in);
        double rate = 0.0;
        boolean fail;
        do
        {
            System.out.print("Please enter your age: ");
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
        while (fail);

        return rate;
    }

    public static String generateOutput(double resting, double age)
    {
        StringBuilder output = new StringBuilder("Intensity    | Rate\n-------------|--------\n");
        int bpm;
        for (int i = 55; i <= 95; i += 5)
        {
            bpm = calculateBPM(i, age, resting);
            output.append(i +"%          | " + bpm +" bpm\n");
        }

        return output.toString();
    }

    public static int calculateBPM(int i, double age, double resting)
    {
        return (int) Math.round((((220.0 - age) - resting) * (i/100.0)) + resting);
    }
}
