package com.ssquare.java.oops.constructor;

public class parameterized_constructor {
    public static void main(String[] args){
        Account account = new Account(101,"Amit",50000.00f);
        Account account1 = new Account(102,"Siddik",10000.00f);

        System.out.println("User 1 Account Details :"+account.getAccount());
        System.out.println("User 2 Account Details :"+account1.getAccount());

        account.deposit(1000.00f);
        account.withdraw(500.50f);
        account1.deposit(2000.00f);
        account1.withdraw(1000.00f);

        System.out.println("Updated Account User 1 Details :"+account.getAccount());
        System.out.println("Updated Account User 2 Details :"+account1.getAccount());
    }
}

class Account{
    private int account_No;
    private String name;
    private float balance;

    public Account(int account_No, String name, float balance) {
        this.account_No = account_No;
        this.name = name;
        this.balance = balance;
    }

    void deposit(float total_amount){
        balance = balance + total_amount;
    }

    void withdraw(float amount){
        if (amount > balance){
            System.out.println("Insufficient Amount");
        }else {
            balance = balance - amount;
        }
    }

    String getAccount(){
        return "Account No :" + account_No + "Name :" + name + "Balance :" + balance;
    }
}

/*
Output of above Program will be:
User 1 Account Details :Account No :101Name :AmitBalance :50000.0
User 2 Account Details :Account No :102Name :SiddikBalance :10000.0
Updated Account User 1 Details :Account No :101Name :AmitBalance :50499.5
Updated Account User 2 Details :Account No :102Name :SiddikBalance :11000.0
 */