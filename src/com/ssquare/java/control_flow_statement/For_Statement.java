package com.ssquare.java.control_flow_statement;

public class For_Statement {
    public static void main(String[] args){
        long p;
        int n;
        double q;
        System.out.println("2 to power of -n    n   2 to power of n");
        p = 1;
        for (n = 0; n < 10; ++n){
            if (n == 0){
                p = 1;
            }else {
                p = p * 2;
                q = 1.0 / p;
                System.out.println(" " + q + " "+ n + " " + " " +p);
            }
        }
    }
}

/*
Output of above program will be:
2 to power of -n    n   2 to power of n
 0.5 1  2
 0.25 2  4
 0.125 3  8
 0.0625 4  16
 0.03125 5  32
 0.015625 6  64
 0.0078125 7  128
 0.00390625 8  256
 0.001953125 9  512

Process finished with exit code 0

 */