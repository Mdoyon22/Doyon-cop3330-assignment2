/**
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Michael Doyon
 */


package ex34;
import java.util.Scanner;
import java.util.ArrayList;

public class App {
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        ArrayList<String> employees = new ArrayList<>();
        employees.add("John Smith");
        employees.add("Jackie Johnson");
        employees.add("Chris Jones");
        employees.add("Amanda Cullen");
        employees.add("Jeremy Goodwin");

        String Outp = printEmps(employees);
        System.out.println(Outp);
        System.out.print("Enter an employee name to remove: ");
        String removeEmp = inp.nextLine();

        employees.removeIf(n -> (n.equals(removeEmp)));
        Outp = printEmps(employees);
        System.out.println(Outp);
    }

    public static String printEmps(ArrayList<String> emps)
    {
        int empCount = emps.size();
        StringBuilder result = new StringBuilder("There are " + empCount + " employees:\n");

        for (String name : emps)
            result.append(name).append("\n");

        return result.toString();
    }


}
