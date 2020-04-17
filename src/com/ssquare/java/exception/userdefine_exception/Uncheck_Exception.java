package com.ssquare.java.exception.userdefine_exception;

import java.util.Scanner;

public class Uncheck_Exception {
    public static void main(String[] args){
        Account account = new Account();
        account.readDetails();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Transaction Amount :");
        float amount = scanner.nextFloat();
        account.withdraw(amount);
        System.out.println("Updated Account :"+account.getAccount());
    }
}
class InsufficientException extends RuntimeException{
    InsufficientException(){

    }
    InsufficientException(String msg){
        super(msg);
    }
}

class Account {
    private int account_No;
    private float account_Balance;
    Scanner scanner = new Scanner(System.in);
    void readDetails(){
        System.out.println("Enter Account Number :");
        account_No = scanner.nextInt();
        System.out.println("Enter Account Balance");
        account_Balance = scanner.nextInt();
    }
    void withdraw(float total_amount){
        try{
            if (total_amount > account_Balance){
                throw new InsufficientException("Balance Not Available");
            }else{
                account_Balance = account_Balance - total_amount;
            }
        }catch (Exception e){
            System.out.println("Message :"+e.getMessage());
        }
    }

    String getAccount(){
        return "Account Number :" + account_No + " " + "Account Balance :" + account_Balance;
    }
}

/*
Output of above Program will be:
case 1:
Enter Account Number :
1234
Enter Account Balance
500
Enter Transaction Amount :
600
Message :Balance Not Available
Updated Account :Account Number :1234 Account Balance :500.0

case 2:
Enter Account Number :
123
Enter Account Balance
2000
Enter Transaction Amount :
1000
Updated Account :Account Number :123 Account Balance :1000.0
 */
