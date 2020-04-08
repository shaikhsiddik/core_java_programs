package com.ssquare.java.oops.class_and_object;

// Method Example
public class Bank {
    public static void main(String[] args){
        Account account = new Account(); //Object Initialization
        account.setAccount();
        account.printAccountDetails();
    }
}

/*
Output of above program will be:
Enter Account Type :
Saving
Enter Account Holder Name :
Amit
Enter Account Number :
125
Enter Account Balance :
75000.50
*********Account User Details*********
Account Type : Saving
Account Holder Name :Amit
Account Number :125
Account Balance :75000.5

Process finished with exit code 0

 */