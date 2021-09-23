/**
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Michael Doyon
 */

package ex27;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class AppTest
{


    @Test
    void test_validateEmployeeID() throws Exception
    {
        App ex27 = new App();

        //True
        assertTrue(ex27.validateEmployeeID("AA-1234"));

        //False
        assertFalse(ex27.validateEmployeeID("AA-6"));
    }

    @Test
    void test_validateName()
    {
        App ex27 = new App();

        //True
        assertTrue(ex27.validateNameExists("John"));

        //False
        assertFalse(ex27.validateNameExists(""));
    }

    @Test
    void test_ValidateNameLength()
    {
        App ex27 = new App();

        //True
        assertTrue(ex27.validateNameLength("James"));

        //False
        assertFalse(ex27.validateNameLength("P"));
    }

    @Test
    void test_ValidateZipCode()
    {
        App ex27 = new App();

        //True
        assertTrue(ex27.validateZipCode("33115"));

        //False Ex:1
        assertFalse(ex27.validateZipCode("777777777"));

        //False Ex:2
        assertFalse(ex27.validateZipCode("abcdef12357"));
    }

    @Test
    void test_ValidateInp()
    {
        App ex27 = new App();

        assertEquals("There were no errors found.", ex27.validateInput("john", "johnson", "33333", "AA-1234"));

        assertNotEquals("There were no errors found.", ex27.validateInput("", "j", "334ghfjn1", "AA-3215"));
    }
}