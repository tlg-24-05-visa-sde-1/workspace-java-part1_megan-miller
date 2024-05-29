/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.hr.personnel.client;

import com.hr.personnel.*;

import java.time.LocalDate;

/**
 * Application main-class.
 */
class HRClient
{

    public static void main(String[] args)
    {
        // create Department object
        Department dept = new Department("Sales", "Seattle");
        System.out.println(dept); // toString() auto called

        // add Employees to it
        dept.addEmployee(new SalariedEmployee("Jason", LocalDate.of(1990, 8, 24), 2500));
        dept.addEmployee(new HourlyEmployee("Julie", LocalDate.of(2000, 2, 2), 65, 5));

        // add a few more - these are salaried and hourly employees
        dept.addEmployee(new SalariedEmployee("Mikey", LocalDate.of(2023, 4, 24),3000));
        dept.addEmployee(new HourlyEmployee("Nala", LocalDate.of(2021, 11, 22),45, 6));

        // add executives
        dept.addEmployee(new Executive("Megan", LocalDate.of(2024, 6, 24), 150_000_000L));

        // list its Employees
        System.out.println("\nList employees:");
        dept.listEmployees();

        // make its Employees work
        System.out.println("\nMake employees work:");
        dept.workEmployees();

        System.out.println("\nPay all employees");
        dept.payEmployees();
        System.out.println();

        System.out.println("\nHoliday break");
        dept.holidayBreak();
        System.out.println();
    }
}