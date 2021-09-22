/**
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Michael Doyon
 */

package ex24;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class App
{
    public static void main(String[] args) throws IOException
    {
        AnagramChecker anagramChecker = new AnagramChecker();
        AnagramCheckDisplay anagramCheckDisplay = new AnagramCheckDisplay(anagramChecker);
        anagramCheckDisplay.printFirstStatement();
        anagramCheckDisplay.readFirstStr();
        anagramCheckDisplay.readSecondStr();
        anagramCheckDisplay.printAnagramCheck();
    }
}

class AnagramChecker
{
    public boolean isAnagram(String firstString, String secondString)
    {
        if (!hasSameInput(firstString, secondString))
        {
            return false;
        }
        final char[] firstStringArray = firstString.toCharArray();
        final char[] secondStringArray = secondString.toCharArray();

        for (char c : firstStringArray)
        {
            if (!containsLetter(secondStringArray, c))
            {
                return false;
            }
        }
        for (char c : secondStringArray)
        {
            if (!containsLetter(firstStringArray, c))
            {
                return false;
            }
        }
        return true;
    }

    private boolean hasSameInput(String firstString, String secondString)
    {
        if (firstString.length() != secondString.length())
            return false;
        return true;
    }

    private boolean containsLetter(char[] array, char letter)
    {
        for (char c : array)
        {
            if (letter == c)
            {
                return true;
            }
        }
        return false;
    }
}


class AnagramCheckDisplay
{
    private static final String First_Str = "Enter the first string: ";
    private static final String Second_Str = "Enter the second string: ";

    private boolean Exit;
    private AnagramChecker anagramChecker;
    private BufferedReader input;
    private String firstString;
    private String secondString;

    public AnagramCheckDisplay(AnagramChecker anagramChecker)
    {
        this.anagramChecker = anagramChecker;
        input = new BufferedReader(new InputStreamReader(System.in));
    }

    public void printFirstStatement()
    {
        System.out.println("Enter two strings and I'll tell you if they are anagrams:");
    }

    public void readFirstStr() throws IOException
    {
        if (!Exit)
        {
            System.out.print(First_Str);

            try
            {
                firstString = input.readLine();
                if (this.exitInp(firstString))
                {
                    return;
                }
                validateInp(firstString);
            }
            catch (IllegalArgumentException ex)
            {
                System.out.print(ex.getMessage());
                readFirstStr();
            }
        }
    }

    public void readSecondStr() throws IOException
    {
        if (!Exit)
        {
            System.out.print(Second_Str);

            try {
                secondString = input.readLine();

                if (this.exitInp(secondString))
                {
                    return;
                }
                validateInp(secondString);
            }
            catch (IllegalArgumentException ex)
            {
                System.out.print(ex.getMessage());
                readSecondStr();
            }
        }
    }

    public void printAnagramCheck()
    {
        if (!Exit)
        {
            boolean isAnagram = anagramChecker.isAnagram(firstString, secondString);
            if (isAnagram)
            {
                System.out.print("\"" + firstString + "\"" + " and " + "\"" + secondString + "\"" + " are anagrams.");
            }
            else
            {
                System.out.print("\"" + firstString + "\"" + " and " + "\"" + secondString + "\"" + " are not anagrams.");
            }
        }
    }

    private boolean exitInp(String InpfromUser)
    {
        if (InpfromUser.equalsIgnoreCase("exit"))
        {
            this.Exit = true;
        }
        return this.Exit;
    }

    private void validateInp(String InpfromUser)
    {
        if (InpfromUser.equalsIgnoreCase("") || InpfromUser.equalsIgnoreCase(""))
        {
            throw new IllegalArgumentException("Input should be a string not void!");
        }
    }
}
