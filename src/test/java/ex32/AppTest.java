/**
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Michael Doyon
 */


package ex32;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class AppTest
{
    App ex32 = new App();

    @Test
    public void test_randInRange()
    {
        int min = 5, max = 60, randominRange = ex32.randInRange(min, max);

        assertTrue(randominRange >= 5 && randominRange <= 60);

        assertFalse(randominRange < 5 && randominRange > 60);
    }

    @Test
    public void test_VerifyPlayAgain()
    {
        String Yes = "y", No = "n";

        assertTrue(ex32.verifyPlayAgain(Yes));

        assertFalse(ex32.verifyPlayAgain(No));

        assertFalse(ex32.verifyPlayAgain("V"));
    }
}