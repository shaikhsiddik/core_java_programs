package com.ssquare.java.oops.class_and_object;

public class College {
    public static void main(String[] args){
        Student student = new Student();
        student.setStudentDetails("Suraj Takale","Pune",85);
        student.printStudentDetails();
    }
}

/*
Output of above Program will be:
Student Name : Suraj Takale
Student Address :Pune
Student Roll Number :85

Process finished with exit code 0
 */