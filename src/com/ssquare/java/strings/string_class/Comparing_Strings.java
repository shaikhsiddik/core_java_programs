package com.ssquare.java.strings.string_class;

import java.util.Scanner;

public class Comparing_Strings {
    public static void main(String[] args){
        String user_Name,user_Password;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter User Name");
        user_Name = scanner.next();
        System.out.println("Enter User Password");
        user_Password = scanner.next();

        if (user_Name.equals("Admin") && user_Password.equals("1234")){
            System.out.println("Welcome to my world");
        }else{
            System.out.println("Sorry Please Try again");
        }
    }
}

/*
Output of above Program will be:
case 1:
Enter User Name
Admin
Enter User Password
1234
Welcome to my world

case 2:
Enter User Name
Admin
Enter User Password
Admin
Sorry Please Try again
 */
