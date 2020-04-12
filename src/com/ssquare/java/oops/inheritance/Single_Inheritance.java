package com.ssquare.java.oops.inheritance;

public class Single_Inheritance {
    public static void main(String[] args){
        DisplayDetails  displayDetails = new DisplayDetails(101,"Siddik",1250000.00f);
    }
}

class Bank{
    private int account_No;
    private String account_UserName;
    private float account_Balance;

    public Bank(int account_No, String account_UserName, float account_Balance) {
        this.account_No = account_No;
        this.account_UserName = account_UserName;
        this.account_Balance = account_Balance;
    }

}

class DisplayDetails extends Bank{

    public DisplayDetails(int account_No, String account_UserName, float account_Balance) {
        super(account_No, account_UserName, account_Balance);
        System.out.println("Account Number is :"+account_No);
        System.out.println("Account User Name is :"+account_UserName);
        System.out.println("Account User Balance is :"+account_Balance);
    }
}

/*
Output of above program will be:
Account Number is :101
Account User Name is :Siddik
Account User Balance is :1250000.0

Process finished with exit code 0
 */