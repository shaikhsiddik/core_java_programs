package com.ssquare.java.control_flow_statement;

public class DoWhile_Statement {
    public static void main(String[] args){
        int row=1, column, x;
        System.out.println("Multiplication table \n");
        do {
            column = 1;
            do {
                x = row * column;
                System.out.println(" "+ x);
                column = column + 1;
            }while (column <= 3);
            System.out.println("\n");
            row = row +1;
        }while (row <= 3);
    }
}

/*
Output of above program will be:
Multiplication Table
1 2 3
2 4 6
3 6 9
 */