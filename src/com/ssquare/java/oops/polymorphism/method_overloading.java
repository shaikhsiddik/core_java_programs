package com.ssquare.java.oops.polymorphism;

public class method_overloading {
    public static void main(String[] args){
        Employee employee = new Employee();
        Employee employee1 = new Employee();

        employee.setEmployeeDetails(101,"Amit");
        employee1.setEmployeeDetails(102,"Siddik",45000.00f);

        String emp = employee.getEmployeeDetails();
        String emp1 = employee1.getEmployeeDetails();

        System.out.println("First Employee Details :"+emp);
        System.out.println("Second Employee Details :"+emp1);
    }
}

class Employee{
    private int empNo;
    private String empName;
    private float empSal;

    void setEmployeeDetails(int no,String name){
        this.empNo  = no;
        this.empName = name;
    }
    void setEmployeeDetails(int no, String name, float sal){
        this.empNo = no;
        this.empName = name;
        this.empSal = sal;
    }

   String getEmployeeDetails(){
        return "Name :"+ empName + " Number :" + empNo + " Sal :" + empSal ;
   }
}

/*
Output of above Program will be:
First Employee Details :Name :Amit Number :101 Sal :0.0
Second Employee Details :Name :Siddik Number :102 Sal :45000.0

Process finished with exit code 0
 */
