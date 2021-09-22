/**
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Michael Doyon
 */


package ex31;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class AppTest
{
    @Test
    public void calcBPM_138()
    {
        App app = new App();
        int actual = app.calculateBPM(55, 22, 65);
        assertEquals(138, actual);
    }

    @Test
    public void calcBPM_0()
    {
        App app = new App();
        int actual = app.calculateBPM(1, 1, 1);
        assertEquals(3, actual);
    }
}