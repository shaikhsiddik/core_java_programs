package com.ssquare.java.oops.class_and_object;

import java.util.Scanner;

public class Account {
    private String account_Type, holder_Name;
    private int account_number;
    private float account_balance;

    /*
    Class is loaded with class name. Account is a object because we can create class
    on the view of object.
     */

    void setAccount(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Account Type :");
        account_Type= scanner.next();
        System.out.println("Enter Account Holder Name :");
        holder_Name = scanner.next();
        System.out.println("Enter Account Number :");
        account_number = scanner.nextInt();
        System.out.println("Enter Account Balance :");
        account_balance = scanner.nextFloat();

    }

    void printAccountDetails(){
        System.out.println("*********Account User Details*********");
        System.out.println("Account Type : "+account_Type);
        System.out.println("Account Holder Name :"+holder_Name);
        System.out.println("Account Number :"+account_number);
        System.out.println("Account Balance :"+account_balance);
    }
}
