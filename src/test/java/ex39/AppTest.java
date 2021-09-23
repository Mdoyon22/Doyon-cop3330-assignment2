/**
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Michael Doyon
 */


package ex39;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.Map;


class AppTest
{
    App ex39 = new App();

    @Test
    void getRow_0()
    {
        int row = 0;
        List<Map<String, String>> records;
        records = App.generateRecords();
        String actual = App.getRow(records, row);
        String expected = "Jacquelyn Jackson   | DBA               |\n";

        assertEquals(expected, actual);
    }

    @Test
    void getRow_1()
    {
        int row = 1;
        List<Map<String, String>> records;
        records = App.generateRecords();
        String actual = App.getRow(records, row);
        String expected = "Jake Jacobson       | Programmer        |\n";

        assertEquals(expected, actual);
    }

    @Test
    void getRow_5()
    {
        int row = 5;
        List<Map<String, String>> records;
        records = App.generateRecords();
        String actual = App.getRow(records, row);
        String expected = "Tou Xiong           | Software Engineer | 2016-10-05\n";

        assertEquals(expected, actual);
    }
}