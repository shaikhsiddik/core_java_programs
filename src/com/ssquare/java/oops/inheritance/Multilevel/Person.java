package com.ssquare.java.oops.inheritance.Multilevel;

public class Person {
    private String name;
    Person(String s)
    {
        setName(s);
    }
    public void setName(String s)
    {
        name = s;
    }
    public String getName()
    {
        return name;
    }
    public void display()
    {
        System.out.println("Name of Person = " + name);
    }
}
