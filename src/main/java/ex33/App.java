/**
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Michael Doyon
 */


package ex33;
import java.util.Scanner;
import java.util.Random;

public class App
{
    public static void main(String[] args)
    {
        Random r = new Random();
        int randIdx = r.nextInt(3);
        System.out.print("What's your question?\n> ");

        Scanner inp = new Scanner(System.in);
        String question = inp.nextLine();

        System.out.println("\n" + pickRandomTemp(randIdx));
    }

    public static String pickRandomTemp(int randIdx)
    {
        String[] temp = {"Yes", "No", "Ask again later."};
        return temp[randIdx];
    }
}
