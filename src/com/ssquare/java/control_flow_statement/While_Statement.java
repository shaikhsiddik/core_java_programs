package com.ssquare.java.control_flow_statement;

import java.util.Scanner;

public class While_Statement {
    public static void main(String[] args){
        char c;
        Scanner scanner = new Scanner(System.in);
        StringBuffer stringBuffer = new StringBuffer();
        System.out.println("Enter String value:");
        try {
            while ((c = (char) System.in.read()) != '\n'){
                stringBuffer.append(c);
            }
        }catch (Exception e){
            System.out.println("Error");
        }
       System.out.println("Enter String is===>"+stringBuffer);
    }
}

/*
output of above program will be:
Enter String value:
shaikh siddik
Enter String is===>shaikh siddik
 */