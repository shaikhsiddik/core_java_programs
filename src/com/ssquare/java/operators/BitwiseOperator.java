package com.ssquare.java.operators;

public class BitwiseOperator {
    public static void main(String[] args){
        int x = 0x0006;
        int y = 0x0008;

        // bitwise and Operator
        System.out.println("AND Operator (a&b) = "+ (x & y));

        // bitwise OR Operator
        System.out.println("OR Operator (x|y) = "+(x|y));

        // bitwise XOR Operator
        System.out.println("XOR Operator (x^y) = "+(x^y));

        // bitwise complement Operator
        System.out.println("Complement Operator (~y) = "+(~y));

    }
}

/*
Output of above Program will be:
"C:\Program Files\Java\jdk1.8.0_121\bin\java.exe"
AND Operator (a&b) = 0
OR Operator (x|y) = 14
XOR Operator (x^y) = 14
Complement Operator (~y) = -9
Process finished with exit code 0
 */