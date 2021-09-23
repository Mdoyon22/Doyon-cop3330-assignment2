/**
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Michael Doyon
 */


package ex38;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class AppTest
{
    App ex38 = new App();

    @Test
    void test_filterEvenNums()
    {
        int[] sampleNums = {24, 31, 33, 57, 88, 99, 102, 17, 28};
        int[] expectedFilterNums = {24, 88, 102, 28};

        assertArrayEquals(expectedFilterNums, ex38.filterEvenNumbers(sampleNums));
    }
}