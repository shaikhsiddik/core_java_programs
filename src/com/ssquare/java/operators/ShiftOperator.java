package com.ssquare.java.operators;

public class ShiftOperator {
    public static void main(String[] args){
        int x = 0x0005;
        int y = -25;

        // left shift operator
        System.out.println("Left Shift Operator (x<<2) = "+(x << 2));

        // right shift operator
        System.out.println("Right Shift Operator (x>>2) = "+(x >> 2));

        // unsigned right shift operator
        System.out.println("Unsigned Right Shift Operator (y>>>2) = "+(y >>> 2));
    }
}

/*
Output of above program will be
"C:\Program Files\Java\jdk1.8.0_121\bin\java.exe"
Left Shift Operator (x<<2) = 20
Right Shift Operator (x>>2) = 1
Unsigned Right Shift Operator (y>>>2) = 1073741817
Process finished with exit code 0
 */