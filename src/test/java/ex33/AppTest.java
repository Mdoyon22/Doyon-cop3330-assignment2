/**
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Michael Doyon
 */


package ex33;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Random;

class AppTest
{
    App ex33 = new App();

    @Test
    public void test_pickRandTemp()
    {
        Random r = new Random();
        int max_Exclusive = 3, randomIdx1 = r.nextInt(max_Exclusive), randomIdx2 = r.nextInt(max_Exclusive);

        while (randomIdx2 == randomIdx1)
            randomIdx2 = r.nextInt(max_Exclusive);

        String[] temps = {"Yes", "No", "Ask again later."};

        assertTrue(ex33.pickRandomTemp(randomIdx1).equals(temps[randomIdx1]));

        assertFalse(ex33.pickRandomTemp(randomIdx1).equals(temps[randomIdx2]));
    }
}