/**
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Michael Doyon
 */

package ex27;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class AppTest
{
    static App ex27 = new App();

    @Test
    public void test_validateEmployeeID() throws Exception
    {
        //True
        assertTrue(ex27.validateEmployeeID("AA-1234"));

        //False
        assertFalse(ex27.validateEmployeeID("AA-6"));
    }

    @Test
    public void test_validateName()
    {
        //True
        assertTrue(ex27.validateNameExists("John"));

        //False
        assertFalse(ex27.validateNameExists(""));
    }

    @Test
    public void test_ValidateNameLength()
    {
        //True
        assertTrue(ex27.validateNameLength("James"));

        //False
        assertFalse(ex27.validateNameLength("P"));
    }

    @Test
    public void test_ValidateZipCode()
    {
        //True
        assertTrue(ex27.validateZipCode("33115"));

        //False Ex:1
        assertFalse(ex27.validateZipCode("777777777"));

        //False Ex:2
        assertFalse(ex27.validateZipCode("abcdef12357"));
    }

    @Test
    public void test_ValidateInp()
    {
        assertEquals("There were no errors found.", ex27.validateInput("john", "johnson", "33333", "AA-1234"));

        assertNotEquals("There were no errors found.", ex27.validateInput("", "j", "334ghfjn1", "AA-3215"));
    }
}