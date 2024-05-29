package com.hr.personnel;

import gov.irs.TaxPayer;

import java.time.LocalDate;

public class HourlyEmployee extends Employee implements TaxPayer {
    // static fields aka instance variables
    public static final double HOURLY_TAX_RATE = 0.25;

    // fields aka instance variables
    private double rate;
    private double hours;

    public HourlyEmployee()
    {
        //non op ctor
    }

    public HourlyEmployee(String name, LocalDate hireDate)
    {
        super(name, hireDate);
    }

    public HourlyEmployee(String name, LocalDate hireDate, double rate, double hours)
    {
        super(name, hireDate); // delegates to superclass ctor, which handles name, hireDate
        setRate(rate); //handle these myself, by delegating to their setters
        setHours(hours);
    }
     // business methods
    @Override
    public void pay()
    {
        System.out.println(getName() + " is paid hourly " + (getRate() * getHours()));
    }

    @Override
    public void payTaxes()
    {
        double taxes = getRate() * HOURLY_TAX_RATE;
        System.out.println(getName() + " paid hourly taxes of " + taxes);
    }

    //accessor methods

    public double getRate()
    {
        return rate;
    }

    public void setRate(double rate)
    {
        this.rate = rate;
    }

    public double getHours()
    {
        return hours;
    }

    public void setHours(double hours)
    {
        this.hours = hours;
    }

    @Override
    public String toString()
    {
        // delegate to superclass toString() (Employee) for classname, name, and hireDate info
        // and then add on my bit: rate and hours
        return super.toString() + ", rate=" + getRate() + ", hours=" + getHours();
    }
}
