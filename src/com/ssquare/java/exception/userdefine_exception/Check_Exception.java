package com.ssquare.java.exception.userdefine_exception;

import java.util.Scanner;

public class Check_Exception {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter User Name :");
        String user = scanner.next();
        System.out.println("Enter User Password :");
        String password = scanner.next();
        Login.login(user,password);
    }
}

class LoginException extends Exception{
    LoginException(){
        super("Invalid User Name and Password please try again...");
    }
}

class Login{
    static void login(String user_name, String user_password){
        try {
            if (user_name.equals("admin") && user_password.equals("12345")){
                System.out.println("Welcome to My World");
            }else{
                throw new LoginException();
            }
        }catch (LoginException e){
            System.out.println("Exception is :"+e.getMessage());
        }
    }
}

/*
Output of above Program will be:
case 1:
Enter User Name :
siddik
Enter User Password :
12354
Exception is :Invalid User Name and Password please try again...

case 2:
Enter User Name :
admin
Enter User Password :
12345
Welcome to My World
 */