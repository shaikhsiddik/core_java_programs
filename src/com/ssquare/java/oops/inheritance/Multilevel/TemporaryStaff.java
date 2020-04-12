package com.ssquare.java.oops.inheritance.Multilevel;

public class TemporaryStaff extends Staff{
    private int days;
    private int hoursWorked;
    TemporaryStaff(String sname,int id,int days,int hoursWorked)
    {
        super(sname,id);
        this.days  = days;
        this.hoursWorked = hoursWorked;
    }
    public int Salary()
    {
        int salary = days * hoursWorked * 50;

        return salary;
    }
    public void display()
    {
        super.display();
        System.out.println("No. of Days = " + days);
        System.out.println("No. of Hours Worked = " + hoursWorked);
        System.out.println("Total Salary = " + Salary());
    }
}
