package com.ssquare.java.oops.inner_classes;

public class Local_Inner_Classes {
    public static void main(String[] args){
        College college = new College();
        college.CollegeStudent();
    }
}
class College{
    public void CollegeStudent(){
        System.out.println("Inside College...");
        class Student{
            void InsideClass(){
                System.out.println("Inside Class...");
            }
        }
        Student student = new Student();
        student.InsideClass();
    }
}

/*
Output of above program will be:
Inside College...
Inside Class...

Process finished with exit code 0
 */