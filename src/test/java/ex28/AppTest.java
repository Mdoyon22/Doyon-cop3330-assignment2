/**
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Michael Doyon
 */


package ex28;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class AppTest
{
    static App ex28 = new App();

    @Test
    public void test_calcSum()
    {
        int[] testArr = {1,2,3,4,5};

        //True
        assertEquals("The total is 15.", ex28.calcSum(testArr));

        //False
        assertNotEquals("The total is 55", ex28.calcSum(testArr));
    }
}