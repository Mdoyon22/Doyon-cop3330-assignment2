/**
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Michael Doyon
 */


package ex26;

import java.util.Hashtable;
import java.util.Scanner;

public class App
{
    public static void main(String[] args)
    {
        Hashtable<String, Double> info = getInfo();
        PaymentCalculator calculator = new PaymentCalculator();

        int numofMonthsToPayOff = calculator.calculateMonthsUntilPaidOff(info.get("dailyrate"), info.get("balance"), info.get("monthlypayment"));
        System.out.print(createPaymentDisplay(numofMonthsToPayOff));
    }


    public static Hashtable<String, Double> getInfo()
    {
        Scanner inp = new Scanner(System.in);

        Hashtable<String, Double> info = new Hashtable<String, Double>();
        System.out.print("What is your balance? ");
        double bal = inp.nextDouble();
        info.put("balance", bal);

        System.out.print("What is the APR on the card (as a percent)? ");
        double dayRate = inp.nextDouble() / 100 / 365;
        info.put("dailyrate", dayRate);

        System.out.print("What is the monthly payment you can make? ");
        double monthlyPay = inp.nextDouble();
        info.put("monthlypayment", monthlyPay);

        return info;
    }

    public static String createPaymentDisplay(int months)
    {
        return String.format("It will take you %d months to pay off this card." , months);
    }
}
