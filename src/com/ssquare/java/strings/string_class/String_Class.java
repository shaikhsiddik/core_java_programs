package com.ssquare.java.strings.string_class;

public class String_Class {
    public static void main(String[] args){
        String name = "Amit";
        String[] address = {"Aurangabad","Pune","Mumbai","Hyderabad","Goa"};
        String age = "24";

        System.out.println("User Name :"+name);
        for(String add : address){
            System.out.println("User Address is :"+add);
        }
        System.out.println("User Age is :"+String.valueOf(age));
    }
}
/*
Output of above program will be:
User Name :Amit
User Address is :Aurangabad
User Address is :Pune
User Address is :Mumbai
User Address is :Hyderabad
User Address is :Goa
User Age is :24
 */


