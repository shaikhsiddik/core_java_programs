package com.ssquare.java.control_flow_statement;

import java.util.Scanner;

public class NestedIf_Statement {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Value");
        System.out.println("Value of A is :");
        int a = scanner.nextInt();
        System.out.println("Value of B is :");
        int b = scanner.nextInt();
        System.out.println("Value of C is :");
        int c = scanner.nextInt();
        if (a > b){
            if (a > c) {
                System.out.println("A is Greater"+a);
            }else {
                System.out.println("C is Greater"+c);
            }
        }else {
            if (c > b){
                System.out.println("C is Greater"+c);
            }else{
                System.out.println("B is Greater"+b);
            }
        }
    }
}
/*
output of above program will be:
Enter Value
Value of A is :
325
Value of B is :
712
Value of C is :
428
B is Greater712

Process finished with exit code 0

 */