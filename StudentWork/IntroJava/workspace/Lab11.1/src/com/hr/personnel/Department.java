/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.hr.personnel;

import java.util.ArrayList;
import java.util.Collection;

/**
 * The Department class manages employees.
 *
 * Properties:
 *   String name
 *   String location
 *   Employee[] employees  the Employees in this department.
 *   int currentIndex      internal counter for number of employees in the department.
 *
 * Methods (excluding get/set methods):
 *   void listEmployees()  print info on all employees in the department.
 *   void workEmployees()  make all employees in the department work.
 *   String toString()     self-explanatory.
 */
public class Department
{
    // fields
    private String name;
    private String location;
    private final Collection<Employee> employees = new ArrayList<>();


    // constructors
    public Department()
    {
        super();
    }

    public Department(String name, String location)
    {
        super();
        setName(name);
        setLocation(location);
    }

    // business methods
    public void listEmployees()
    {
        for(Employee emp : employees)
        {
            System.out.println(emp);  // toString() auto called
        }
    }

    public void workEmployees()
    {
        for (Employee emp : employees)
        {
            emp.work();
        }
    }

    public void payEmployees()
    {
        for (Employee emp : employees)
        {
            emp.pay();
        }
    }

    // For all employees that take vacation, make them do that.
    // Salaried employees only
    public void holidayBreak()
    {
        for (Employee emp : employees)
        {
            // IF emp is actually referring to a SalariedEmployee object,
            // "downcast" the Employee reference to more specific type, SalariedEmployee (instanceof)
            // then we can call SalariedEmployee-specific methods like takeVacation()
            if(emp instanceof SalariedEmployee)
            {
                // downcast and method call in one shot - best if only for one method call
                // ((SalariedEmployee) employees[i]).takeVacation();

                // explicitly create a NEW reference of type SalariedEmployee (semp) - best for multiple method calls
                SalariedEmployee semp = (SalariedEmployee) emp;
                semp.takeVacation();
            }
        }
    }

    // helper method to add an Employee to the array
    public void addEmployee(Employee emp)
    {
        employees.add(emp);
    }

    // accessor methods
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getLocation()
    {
        return location;
    }

    public void setLocation(String location)
    {
        this.location = location;
    }

    @Override
    public String toString()
    {
        return "Department: name=" + getName() + ", location=" + getLocation();
    }
}