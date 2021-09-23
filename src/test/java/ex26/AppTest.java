/**
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Michael Doyon
 */


package ex26;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AppTest
{


    @Test
    void test_calcMonthsUntilPaidOff()
    {
        PaymentCalculator calculator = new PaymentCalculator();

        Assertions.assertEquals(calculator.calculateMonthsUntilPaidOff(12.0/100/365, 5000, 100), 70);

        Assertions.assertNotEquals(calculator.calculateMonthsUntilPaidOff(12.0/100/365, 5000, 100), 55);
    }
}