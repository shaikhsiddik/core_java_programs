package com.ssquare.java.exception;

import java.util.Scanner;

public class Exception_Throw {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 2 Number :");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        try{
            if (n2 == 0){
                throw new ArithmeticException();
            }else{
                int n3 = n1*n2;
                System.out.println("Multiplication :"+n3);
            }
        }catch (Exception e){
            System.out.println("Exception is :"+e.getMessage());
        }
    }
}

/*
Output of above Program will be:
case 1:
12
12
Multiplication :144

case 2:
Enter 2 Number :
0
0
Exception is :null
 */