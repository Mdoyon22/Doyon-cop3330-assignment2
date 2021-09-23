/**
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Michael Doyon
 */


package ex36;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class AppTest
{
    private App ex36 = new App();
    private int[] sampleNumArr = {50, 57, 32, 37, 850, 4, 6, 1, 60, 542, 11};

    @Test
    void test_min()
    {
        ArrayList<Integer> sampleNumList = new ArrayList<Integer>();

        for (int i = 0; i < sampleNumArr.length; i++)
            sampleNumList.add(sampleNumArr[i]);

        assertEquals(1, ex36.min(sampleNumList));

        assertNotEquals(4, ex36.min(sampleNumList));
    }

    @Test
    void test_max()
    {
        ArrayList<Integer> sampleNumList = new ArrayList<Integer>();

        for (int i = 0; i < sampleNumArr.length; i++)
            sampleNumList.add(sampleNumArr[i]);

        assertEquals(850, ex36.max(sampleNumList));

        assertNotEquals(4, ex36.max(sampleNumList));

    }

    @Test
    void test_average()
    {
        ArrayList<Integer> sampleNumList = new ArrayList<Integer>();

        for (int i = 0; i < sampleNumArr.length; i++)
            sampleNumList.add(sampleNumArr[i]);

        double sum = 0.0, average;

        for (int i = 0; i < sampleNumList.size(); i++)
            sum += sampleNumList.get(i);

        average = sum / sampleNumList.size();

        assertEquals(average, ex36.average(sampleNumList));

        assertNotEquals(4, ex36.average(sampleNumList));
    }

    @Test
    void test_std()
    {
        double sum = 0, stdev = 0, finalstd, average;
        ArrayList<Integer> sampleNumList = new ArrayList<Integer>();

        for (int i = 0; i < sampleNumList.size(); i++)
            sum += sampleNumList.get(i);

        average = sum / sampleNumList.size();

        for (int d : sampleNumList)
        {
            stdev += Math.pow(d - average, 2);
        }

        finalstd = Math.sqrt(stdev / sampleNumList.size());

        assertEquals(finalstd, ex36.std(sampleNumList));

        assertNotEquals(60, ex36.std(sampleNumList));
    }
}