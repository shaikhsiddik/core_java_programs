package com.ssquare.java.oops.polymorphism;

public class method_overriding {
    public static void main(String[] args){
        Addition addition = new Addition();
        addition.addition(12,15);
    }
}

class Calculator{
    int c;
    void addition(int x, int y){
        c = x + y;
        System.out.println("Addition is :"+c);
    }
}

class Addition extends Calculator{
    void addition(int x, int y){
        int c = x + y;
        System.out.println("Addition is :"+c);
    }
}

/*
Output of above program will be:
Addition is :27

Process finished with exit code 0

 */