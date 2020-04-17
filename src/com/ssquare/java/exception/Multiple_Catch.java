package com.ssquare.java.exception;

import java.util.Scanner;

public class Multiple_Catch {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter Value A :");
            int a = scanner.nextInt();
            System.out.println("Enter Value B :");
            int b = scanner.nextInt();
            int c = a/b;
            System.out.println("Division of C :"+c);
        }catch (ArithmeticException e){
            System.out.println("Arithmetic Exception Occurred");
        }catch (NumberFormatException e){
            System.out.println("NUmber Format Exception Occurred");
        }
    }
}

/*
Output of above Program will be:
case 1 :
Enter Value A :
5
Enter Value B :
0
Arithmetic Exception Occurred
 */
