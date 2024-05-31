package com.hr.client;

import com.hr.Employee;
import com.hr.WorkException;


public class EmployeeClient
{

    public static void main(String[] args) throws WorkException
    {

        Employee emp = new Employee("Megan");

        try
        {
            emp.goToWork();
        }
        catch (WorkException e)
        {
            System.out.println(e.getMessage());
            System.out.println(e.getCause()); // extracts the nested 'cause'
            System.out.println();
            e.printStackTrace();
        }

    }
}