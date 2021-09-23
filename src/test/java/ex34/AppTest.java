/**
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Michael Doyon
 */


package ex34;
import static ex34.App.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

class AppTest
{
    @Test
    void printEmployees_1()
    {
        ArrayList<String> employees = new ArrayList<String>();
        employees.add("One Guy");
        String actual = printEmps(employees);
        assertEquals("There are 1 employees:\nOne Guy\n", actual);
    }

    @Test
    void printEmployees_2()
    {
        ArrayList<String> employees = new ArrayList<String>();
        employees.add("One Guy");
        employees.add("Two Guys");
        String actual = printEmps(employees);
        assertEquals("There are 2 employees:\nOne Guy\nTwo Guys\n", actual);
    }

}