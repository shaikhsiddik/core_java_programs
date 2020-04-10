package com.ssquare.java.oops.static_modifier;

public class Static_Method {
    public static void main(String[] args){
        int s = Math.sqrt(5);
        int m = Math.max(20,10);
        System.out.println("Sqr is :"+s);
        System.out.println("Max is :"+m);
    }
}

class Math{
    static int sqrt(int n){
        return n*n;
    }
    static int max(int x, int y){
        if (x>y){
            return x;
        }else {
            return y;
        }
    }
}
/*
Output of above program will be:
Sqr is :25
Max is :20

Process finished with exit code 0
 */
