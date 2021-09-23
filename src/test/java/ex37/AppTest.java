/**
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Michael Doyon
 */


package ex37;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

class AppTest
{
    final int size = 15;
    int numsToAddCount = 4, specialCharsToAddCount = 5;
    App ex37 = new App();
    char[] password = new char[size];
    char[] specialChars = {'!', '@', '#', '$', '%', '^', '&', '*'};
    char[] digits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    @Test
    void test_fillLetters()
    {
        ex37.fillwithLetters(password, letters);

        int lettercount = 0;

        for (char c : password)
            if (Character.isLetter(c))
                lettercount++;

            assertEquals(size, lettercount);
    }

    @Test
    void test_IntegrateSpecialChars()
    {
        ex37.fillwithLetters(password, letters);
        ex37.IntegrateRandNums(password, digits, numsToAddCount);
        ex37.IntergrateRandSpecialChars(password, specialChars, specialCharsToAddCount);

        int specialCharsFound = 0;

        for (int i = 0; i < password.length; i++)
            if (!Character.isLetterOrDigit(password[i]))
                specialCharsFound++;

            assertEquals(specialCharsToAddCount, specialCharsFound);
    }
}