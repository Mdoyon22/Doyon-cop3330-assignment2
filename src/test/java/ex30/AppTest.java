/**
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Michael Doyon
 */


package ex30;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class AppTest
{
    static App ex30 = new App();

    @Test
    public void test_CalcSum()
    {
        //True
        assertEquals(250, ex30.calcProd(50, 5));

        //False
        assertNotEquals(13, ex30.calcProd(50, 5));
    }
}