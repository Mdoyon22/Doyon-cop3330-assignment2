/**
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Michael Doyon
 */


package ex35;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class App
{
    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<String>();
        Scanner inp = new Scanner(System.in);
        Random rand = new Random();

        do
        {
            System.out.print("Enter a name: ");
            String name = inp.nextLine();

            if (checkNameExists(name))
                list.add(name);
            else
                break;
        }
        while (true);

        int randIdx = rand.nextInt(list.size());
        System.out.print(createWinnerDisplay(list, randIdx));

    }

    public static String createWinnerDisplay(ArrayList<String> list, int randIdx)
    {
        return String.format("The winner is... %s.", list.get(randIdx));
    }

    public static boolean checkNameExists(String name)
    {
        return !name.equals("");
    }
}
