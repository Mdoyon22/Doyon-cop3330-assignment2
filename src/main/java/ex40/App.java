/**
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Michael Doyon
 */


package ex40;
import java.util.*;


public class App
{
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a search string: ");
        String search = inp.nextLine();
        List<Map<String, String>> records;
        records = generateRecords();

        StringBuilder output = new StringBuilder(("""
                Name                | Position          | Separation Date
                --------------------|-------------------|----------------
                """));

        for (int i = 0; i < records.size(); i++)
        {
            String row = (getRow(records, i, search));

            if (row.length() > 0)
                output.append(row);
        }

        System.out.println(output);
    }

    public static String getRow(List<Map<String, String>> records, int i, String search)
    {
        Map<String, String> feed = records.get(i);
        String name = feed.get("name").toLowerCase();

        if (name.contains(search.toLowerCase()))
        {
            return feed.get("name") + feed.get("position") + feed.get("separation date") + "\n";
        }

        else
            return "";
    }

    public static List<Map<String, String>> generateRecords()
    {
        List<Map<String, String>> records = new ArrayList<>();
        Map<String, String> record1 = new HashMap<>();
        record1.put("name","Jacquelyn Jackson   |");
        record1.put("sort","Jackson");
        record1.put("position"," DBA               |");
        record1.put("separation date", "");
        records.add(record1);

        Map<String, String> record2 = new HashMap<>();
        record2.put("name","Jake Jacobson       |");
        record2.put("sort","Jacobson");
        record2.put("position"," Programmer        |");
        record2.put("separation date", "");
        records.add(record2);

        Map<String, String> record3 = new HashMap<>();
        record3.put("name","John Johnson        |");
        record3.put("sort","Johnson");
        record3.put("position"," Manager           |");
        record3.put("separation date"," 2016-12-31");
        records.add(record3);

        Map<String, String> record4 = new HashMap<>();
        record4.put("name","Michaela Michaelson |");
        record4.put("sort","Michaelson");
        record4.put("position"," District Manager  |");
        record4.put("separation date"," 2015-12-19");
        records.add(record4);

        Map<String, String> record5 = new HashMap<>();
        record5.put("name","Sally Weber         |");
        record5.put("sort","Weber");
        record5.put("position"," Web Developer     |");
        record5.put("separation date"," 2015-12-18");
        records.add(record5);

        Map<String, String> record6 = new HashMap<>();
        record6.put("name","Tou Xiong           |");
        record6.put("sort","Xiong");
        record6.put("position"," Software Engineer |");
        record6.put("separation date"," 2016-10-05");
        records.add(record6);

        Collections.sort(records, mapComparator);

        return records;
    }

    public static Comparator<Map<String, String>> mapComparator = Comparator.comparing(m -> m.get("sort"));
}
