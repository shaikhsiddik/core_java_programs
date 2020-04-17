package com.ssquare.java.exception;

import java.util.Scanner;

public class Exception_Finally {
    static int m1(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number :");
        int num = scanner.nextInt();
        try{
            System.out.println("Inside try block :");
            if (num%2 !=0){
                return num;
            }
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Exception Occurred"+e);
        }
        finally {
            System.out.println("Inside Finally Block");
        }
        return num;
    }
    public static void main(String[] args){
            int x = m1();
            System.out.println("Value of X is :"+x);
    }
}

/*
Output of above program will be:
case 1 :
Enter Number :
12
Inside try block :
Inside Finally Block
Value of X is :12

 */