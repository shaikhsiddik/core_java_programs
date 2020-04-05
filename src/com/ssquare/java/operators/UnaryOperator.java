package com.ssquare.java.operators;

public class UnaryOperator {
    public static void main(String[] args){
        int a=10, b= 20, c= 30,d= 40, e=0;
        // pre-increment Operator
        e = ++a;
        System.out.println("Pre-Increment Value is: "+e);
        // post increment Operator
        e = b++;
        System.out.println("Post-Increment Value is: "+e);
        // pre-decrement Operator
        e = --c;
        System.out.println("Pre-Decrement Value is: "+e);
        // post decrement Operator
        e = d--;
        System.out.println("Post-Decrement Value is: "+e);
    }
}

/*
Output Will be:
"C:\Program Files\Java\jdk1.8.0_121\bin\java.exe"
Pre-Increment Value is: 11
Post-Increment Value is: 20
Pre-Decrement Value is: 29
Post-Decrement Value is: 40

Process finished with exit code 0
 */