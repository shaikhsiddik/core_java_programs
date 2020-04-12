package com.ssquare.java.oops.constructor;

public class default_constructor {
    public static void main(String[] args){
        Values addition = new Values();
        Values addition1 = new Values();
        System.out.println("values :"+addition.getXY());
        System.out.println("values 1:"+addition1.getXY());
    }
}

class Values {
 private int x;
 private int y;
 Values(){
     x = 10;
     y = 20;
 }
 String getXY(){
     return x + " " + y;
 }
}

/*
Output of above Program will be:
values :10 20
values 1:10 20

Process finished with exit code 0
 */