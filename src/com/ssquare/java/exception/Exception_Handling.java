package com.ssquare.java.exception;

import java.util.Scanner;

public class Exception_Handling {
    public static void main(String[] args){
        int a[] = {10,20,30,40,50};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Input Index :");
        int index = scanner.nextInt();
        try {
            System.out.println("index number of array is :"+a[index]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("invalid index number");
        }
        System.out.println("Executed Finish");
    }
}

/*
Output of above Program will be:
case 1:
Enter Input Index :
2
index number of array is :30
Executed Finish

case 2:
Enter Input Index :
6
invalid index number
Executed Finish
 */