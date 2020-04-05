package com.ssquare.java.operators;

import java.util.Scanner;

public class ArithmeticOperator {
    public static void main(String[] args){
        int a, b, c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Value A:");
        a = scanner.nextInt();
        System.out.println("Value of A is: "+a);
        System.out.println("Enter Value B:");
        b = scanner.nextInt();
        System.out.println("Value of B is: "+b);
        // + operator
        System.out.println("----Addition Performing----");
        c = a + b;
        System.out.println("Addition is : "+c);
        // - operator
        System.out.println("----Subtract Performing----");
        c = a - b;
        System.out.println("Subtraction is :"+c);
        // * operator
        System.out.println("----Multiplication Performing----");
        c = a * b;
        System.out.println("Multiplication is : "+c);
        // '/' operator
        System.out.println("----Division Performing----");
        c = a / b;
        System.out.println("Division is :"+c);
        // % operator
        System.out.println("----Mod Performing----");
        c = a % b;
        System.out.println("Mod is :"+c);
    }
}
/*
Output of above program will be:
"C:\Program Files\Java\jdk1.8.0_121\bin\java.exe"
Enter Value A:
123
Value of A is: 123
Enter Value B:
2
Value of B is: 2
----Addition Performing----
Addition is : 125
----Subtract Performing----
Subtraction is :121
----Multiplication Performing----
Multiplication is : 246
----Division Performing----
Division is :61
----Mod Performing----
Mod is :1

Process finished with exit code 0

 */