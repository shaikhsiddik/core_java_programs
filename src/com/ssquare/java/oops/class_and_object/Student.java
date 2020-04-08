package com.ssquare.java.oops.class_and_object;

// Method With Parameter
public class Student {
    private String student_Name, student_Address;
    private int student_RollNumber;
    void setStudentDetails(String n, String a, int r){
        student_Name = n;
        student_Address= a;
        student_RollNumber = r ;
    }
    void printStudentDetails(){
        System.out.println("Student Name : "+student_Name);
        System.out.println("Student Address :"+student_Address);
        System.out.println("Student Roll Number :"+student_RollNumber);
    }
}
