package com.ssquare.java.oops.static_modifier;

public class Static_Variables {
    public static void main(String[] args){
        Account account = new Account();
        Account account1 = new Account();

        account.setAccount(101,5005.60f);
        account1.setAccount(102,1000.55f);

        Account.rate = 1.5f;

        float f = account.getInterest();
        float f1 = account1.getInterest();

        System.out.println("First User Interest :"+f);
        System.out.println("Second User Interest :"+f1);

        String s = account.getAccount();
        String s1 = account1.getAccount();

        System.out.println("First User Account Details :"+s);
        System.out.println("Second User Account Details :"+s1);
    }
}
class Account{
    private int account_No;
    private float account_balance;
    static float rate;

    void setAccount(int accno, float bal){
        this.account_No = accno;
        this.account_balance = bal;
    }

    float getInterest(){
        return (account_balance * rate * 6) /100;
    }

    String getAccount(){
        return  "Account No :" + account_No + "balance :" + account_balance;
    }
}

/*
Output of above Program will be:
First User Interest :450.50403
Second User Interest :90.04949
First User Account Details :Account No :101balance :5005.6
Second User Account Details :Account No :102balance :1000.55
 */