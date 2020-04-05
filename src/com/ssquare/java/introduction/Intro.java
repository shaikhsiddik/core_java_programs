package com.ssquare.java.introduction;

public class Intro {
    //case 1: user defined method or custom method
    /*void codeKul(){
    //Non-static method 'codeKul()' cannot be referenced from a static context
        System.out.println("Hello From Codekul");
    }*/
    //case 2:
    static void codeKul(){
        System.out.println("Hello From Codekul");
    }
    public static void main(String[] args) {
        // write your code here
        System.out.println("Intro Main Call");
        codeKul();

    }
}
/*
    case 1 output: codekul method not call in main method
        "C:\Program Files\Java\jdk1.8.0_121\bin\java.exe"
        Intro Main Call
        Process finished with exit code 0

    case 2 output: codekul method now we call in main method
     "C:\Program Files\Java\jdk1.8.0_121\bin\java.exe"
        Intro Main Call
        Hello From Codekul
        Process finished with exit code 0

*/