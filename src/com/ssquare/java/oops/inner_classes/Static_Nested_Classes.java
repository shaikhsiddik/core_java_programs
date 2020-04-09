package com.ssquare.java.oops.inner_classes;

class Parent{
    private static void Child(){
        System.out.println("Child Method Executed...");
    }
    static class Static_Nested_Classes{
        public static void main(String[] args){
            System.out.println("Main Method Executed...");
            Child();
        }
    }
}

/*
Output of above program will be:
Inside College...
Inside Class...

Process finished with exit code 0
 */