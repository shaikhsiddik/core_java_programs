package com.ssquare.java.arrays;

public class StudentArray {
    public static void main(String[] args){
        Details[] details = new Details[5];
        details[0] = new Details(82,"Shaikh Siddik");
        details[1] = new Details(86,"Suraj Takale");
        details[2] = new Details(56,"Amit Kakade");
        details[3] = new Details(1,"Shaikh Sarmad");
        details[4] = new Details(5,"Sonali D");

        for (int i = 0; i<details.length; i++){
            System.out.println("Student Roll Number As : "+ details[i].roll_no +" : "+ "Student Name As : "+ details[i].name);
        }
    }
}
class Details{
    int roll_no;
    String name;
    public Details(int roll_no, String name) {
        this.roll_no = roll_no;
        this.name = name;
    }
}

/*
Output of above program will be:
"C:\Program Files\Java\jdk1.8.0_121\bin\java.exe"
Student Roll Number As : 82 : Student Name As : Shaikh Siddik
Student Roll Number As : 86 : Student Name As : Suraj Takale
Student Roll Number As : 56 : Student Name As : Amit Kakade
Student Roll Number As : 1 : Student Name As : Shaikh Sarmad
Student Roll Number As : 5 : Student Name As : Sonali D
Process finished with exit code 0
 */