package com.ssquare.java.oops.final_modifier;

public class Final_Method extends Demo {
    public static void main(String[] args){
        Final_Method final_method = new Final_Method();
        final_method.demo();

    }
}

class Demo{
    final void demo(){
        System.out.println("Demo Class Executed...");
    }
}

/*
Output of above Program will be:
Demo Class Executed...

Process finished with exit code 0
 */
