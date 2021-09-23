/**
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Michael Doyon
 */


package ex35;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Random;

class AppTest
{
    App ex35 = new App();

    @Test
    void test_CheckNameExists()
    {
        String validName = "Michael", invalidName = "";

        assertTrue(ex35.checkNameExists(validName));

        assertFalse(ex35.checkNameExists(invalidName));
    }

    @Test
    void test_createWinnerDisplay()
    {
        ArrayList<String> list = new ArrayList<String>();
        Random rand = new Random();

        list.add("Dave");
        list.add("Steve");
        list.add("Michael");

        int randIdx1 = rand.nextInt(list.size()), randIdx2 = rand.nextInt(list.size());

        while (randIdx2 == randIdx1)
            randIdx2 = rand.nextInt(list.size());

        assertEquals(String.format("The winner is... %s.", list.get(randIdx1)), ex35.createWinnerDisplay(list, randIdx1));

        assertNotEquals(String.format("The winner is... %s.", list.get(randIdx1)), ex35.createWinnerDisplay(list, randIdx2));
    }
}