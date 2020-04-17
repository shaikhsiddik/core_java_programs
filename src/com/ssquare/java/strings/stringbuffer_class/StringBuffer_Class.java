package com.ssquare.java.strings.stringbuffer_class;

public class StringBuffer_Class {
    public static void main(String[] args){
        StringBuffer stringBuffer = new StringBuffer();
        System.out.println("Capacity of String Buffer :"+stringBuffer.capacity());
        stringBuffer.append("Java");
        System.out.println("String is :"+stringBuffer);
        stringBuffer.append("Programming");
        System.out.println("New String is :"+stringBuffer);
        stringBuffer.insert(15,"Language");
        System.out.println("Update String is :"+stringBuffer);
        System.out.println("Capacity of String Buffer :"+stringBuffer.capacity());
    }
}

/*
Output of above Program will be:
Capacity of String Buffer :16
String is :Java
New String is :JavaProgramming
Update String is :JavaProgrammingLanguage
Capacity of String Buffer :34
 */