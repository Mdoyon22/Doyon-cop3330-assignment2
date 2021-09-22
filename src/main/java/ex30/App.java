/**
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Michael Doyon
 */


package ex30;

public class App
{
    public static void main(String [] args)
    {
        for (int column = 1; column <= 12; column++)
        {
            for (int row = 1; row <= 12; row++)
                System.out.print(creatProdString(calcProd(column,row)));

            System.out.print("\n");
        }
    }

    public static int calcProd(int n1, int n2)
    {
        return n1 * n2;
    }

    public static String creatProdString(int prod)
    {
        return String.format("%5d", prod);
    }
}
