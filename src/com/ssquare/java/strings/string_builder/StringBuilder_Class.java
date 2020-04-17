package com.ssquare.java.strings.string_builder;

import java.util.StringTokenizer;

public class StringBuilder_Class {
    public static void main(String[] args){
        String address = "9-08-96,Cideco MIDC, Auaranagabad,431001";
        StringTokenizer stringTokenizer = new StringTokenizer(address,",");
        System.out.println("Count of String is :"+stringTokenizer.countTokens());
        String house_No = stringTokenizer.nextToken();
        String street = stringTokenizer.nextToken();
        String city = stringTokenizer.nextToken();
        String pincode = stringTokenizer.nextToken();
        System.out.println("House No :"+ house_No + " Street Name :"+ street + " City :" + city + " Pincode :" + pincode );
    }
}

/*
Output of above Program will be:
Count of String is :4
House No :9-08-96 Street Name :Cideco MIDC City : Auaranagabad Pincode :431001
 */