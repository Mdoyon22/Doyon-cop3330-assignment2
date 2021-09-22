/**
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Michael Doyon
 */


package ex26;
import java.lang.Math;

public class PaymentCalculator
{
    public int calculateMonthsUntilPaidOff(double i, double b, double p)
    {
        double x = -(1.0/30) * Math.log(1 + b/p * (1 - Math.pow(1 + i, 30))) / Math.log(1 + i);
        return (int) Math.floor(x) + 1;
    }
}
