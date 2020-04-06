package com.ssquare.java.control_flow_statement;

import java.util.Scanner;

public class Switch_Statement {
    public static void main(String[] args){
        int c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter Value of A");
        int a = scanner.nextInt();
        System.out.println("Please Enter Value of B");
        int b = scanner.nextInt();
        System.out.println("Select Your Choice :"+"\n 1. + "+ "\n 2. -"+ "\n 3. * ");
        char choice = scanner.next().charAt(0);

        switch (choice){
            case '+':
                c = a + b;
                System.out.println("Addition is: "+c);
                break;
            case '-':
                c = a - b;
                System.out.println("Subtraction is: "+c);
                break;
            case '*':
                c = a * b;
                System.out.println("Multiplication is: "+c);
                break;
            default:
                System.out.println("Please Enter Correct Choice");
        }
    }
}
/*
output of above program will be:
*******************************************************
Addition:
Please Enter Value of A
6
Please Enter Value of B
3
Select Your Choice :
 1. +
 2. -
 3. *
+
Addition is: 9

*******************************************************
Subtraction:
Please Enter Value of A
30
Please Enter Value of B
5
Select Your Choice :
 1. +
 2. -
 3. *
-
Subtraction is: 25
*******************************************************
Multiplication:
Please Enter Value of A
10
Please Enter Value of B
3
Select Your Choice :
 1. +
 2. -
 3. *
*
Multiplication is: 30

 */