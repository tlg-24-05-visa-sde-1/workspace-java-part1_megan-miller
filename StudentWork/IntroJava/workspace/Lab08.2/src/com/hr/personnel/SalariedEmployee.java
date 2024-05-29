package com.hr.personnel;

import java.time.LocalDate;

public class SalariedEmployee extends Employee
{
    // fields aka instance variables
  private double salary;

    public SalariedEmployee()
    {
        super();
    }

    public SalariedEmployee(String name, LocalDate hireDate)
    {
        super(name, hireDate); // delegate to superclass ctor, which handles name, hireDate

        // registerIn401k().

    }

    public SalariedEmployee(String name, LocalDate hireDate, double salary)
    {
        super(name, hireDate); // delegate to the superclass ctor, which handles name, hireDate
        setSalary(salary); // handle salary myself, by delegating to its setter
    }

    @Override
    public void pay()
    {
        System.out.println(getName() + " is paid a salary of " + getSalary());
    }

    public void takeVacation()
    {
        System.out.println(getName() + " is on vacation");

    }

    public double getSalary()
    {
        return salary;
    }

    public void setSalary(double salary)
    {
        this.salary = salary;
    }

    @Override
    public String toString()
    {
        return super.toString() + ", salary=" + getSalary();
    }


}

