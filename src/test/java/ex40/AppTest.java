/**
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Michael Doyon
 */


package ex40;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.Map;

class AppTest
{
    App ex40 = new App();

    @Test
    void getRow_JAC_0()
    {
        List<Map<String, String>> records;
        records = ex40.generateRecords();
        int row = 0;
        String search = "jac";
        String actual = ex40.getRow(records, row, search);
        String expected = "Jacquelyn Jackson   | DBA               |\n";

        assertEquals(expected, actual);
    }

    @Test
    void getRow_blank_5()
    {
        List<Map<String, String>> records;
        records = ex40.generateRecords();
        int row = 5;
        String search = "";
        String actual = ex40.getRow(records, row, search);
        String expected = "Tou Xiong           | Software Engineer | 2016-10-05\n";

        assertEquals(expected, actual);
    }


}