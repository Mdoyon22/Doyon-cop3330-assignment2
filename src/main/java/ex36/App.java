/**
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Michael Doyon
 */


package ex36;
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math;

public class App
{
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();

        while (true)
        {
            System.out.print("Enter a number: ");
            String line = inp.nextLine();

            if (line.equals("done"))
                break;
            else
            {
                boolean IntFlag = true;
                char[] LSplit = line.toCharArray();

                for (int i = 0; i < LSplit.length && IntFlag; i++)
                {
                    if (!Character.isDigit(LSplit[i]))
                        IntFlag = false;
                }

                if (!IntFlag)
                    continue;
            }

            list.add(Integer.parseInt(line));
        }

        printNums(list);
        System.out.print(createStatsMetricDisplay(average(list), min(list), max(list), std(list)));
    }

    public static int min(ArrayList<Integer> list)
    {
        int min = list.get(0);

        for (int i = 0; i < list.size(); i++)
            if (list.get(i) < min)
                min = list.get(i);

            return min;
    }

    public static int max(ArrayList<Integer> list)
    {
        int max = list.get(0);

        for (int i = 0; i < list.size(); i++)
            if (list.get(i) > max)
                max = list.get(i);

            return max;
    }

    public static double average(ArrayList<Integer> list)
    {
        double sum = 0.0;

        for (int i = 0; i < list.size(); i++)
            sum += list.get(i);

        return sum / list.size();
    }

    public static double std(ArrayList<Integer> list) {
        double STDev = 0.0, mean = average(list);

        for (double x : list) {
            STDev += Math.pow(x - mean, 2);
        }

        return Math.sqrt(STDev / list.size());
    }

    public static void printNums(ArrayList<Integer> list)
    {
        System.out.print("Numbers:");

        for (int i = 0; i < list.size(); i++)
        {
            System.out.print(String.format(" %d", list.get(i)));
            if (i != list.size() - 1)
                System.out.print(",");
            else
                System.out.print("\n");
        }
    }

    public static String createStatsMetricDisplay(double avg, int min, int max, double std)
    {
        return String.format("The average is %.1f\nThe minimum is %d\nThe maximum is %d\nThe standard deviation is %.2f", avg, min, max, std);
    }
}
