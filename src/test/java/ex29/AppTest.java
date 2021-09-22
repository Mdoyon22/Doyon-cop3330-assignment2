/**
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Michael Doyon
 */


package ex29;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class AppTest
{
    @Test
    void calcYears_4_18()
    {
        App app = new App();
        double rate = 4;
        int years = app.calculateYears(rate);
        assertEquals(18, years);
    }

    @Test
    void calcYears_1_72()
    {
        App app = new App();
        double rate = 1;
        int years = app.calculateYears(rate);
        assertEquals(72, years);
    }
}