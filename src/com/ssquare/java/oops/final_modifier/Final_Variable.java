package com.ssquare.java.oops.final_modifier;

public class Final_Variable {
    public static void main(String[] args){
        final String name[] = {"Amit", "Suraj", "Varun", "Siddik"};
        for (final String i : name){
            System.out.println(i+ " ");
        }
    }
}

/*
Output of above Program will be:
Amit
Suraj
Varun
Siddik

Process finished with exit code 0
 */