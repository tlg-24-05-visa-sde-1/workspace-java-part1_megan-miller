/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.hr.personnel;

import java.time.LocalDate;

/**
 * The Employee class is fairly simple, serving as a superclass to illustrate inheritance.
 *
 * Properties:
 *   String name
 *   LocalDate hireDate
 *
 * Methods (excluding get/set methods):
 *   void work()        simulates work by printing a message to show it was called.
 *   String toString()  self-explanatory.
 */
public abstract class Employee
{
    // fields
    private String name;
    private LocalDate hireDate;

    // constructors
    public Employee()
    {
        // non op ctor
    }

    public Employee(String name, LocalDate hireDate)
    {
        setName(name);
        setHireDate(hireDate);
    }

    // business methods
    // "all employees work & get paid" -> they have this in common, so must go here
    public void work()
    {
        System.out.println(getName() + " working hard since " + getHireDate());
    }

    // we need a pay method here to say all employees get paid but it cabn't be implemented from here
    public abstract void pay();

    // accessor methods
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public LocalDate getHireDate()
    {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate)
    {
        this.hireDate = hireDate;
    }

    @Override
    public String toString()
    {
        return getClass().getSimpleName() + ": name=" + getName() + ", hireDate=" + getHireDate();
    }
}