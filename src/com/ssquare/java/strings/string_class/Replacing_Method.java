package com.ssquare.java.strings.string_class;

public class Replacing_Method {
    public static void main(String[] args){
        String pro = "Java Programming Language";
        pro = pro.replace('P','p');
        pro = pro.replace('L','l');
        System.out.println("Update String is :"+pro);

        String p[] = pro.split("Java");
        System.out.println("Length of String is :"+p.length);
        for (int i=1; i<p.length; i++){
            System.out.println("Split String is :"+p[i]);
        }
    }
}

/*
Output of above Programming is:
Update String is :Java programming language
Length of String is :2
Split String is : programming language
 */