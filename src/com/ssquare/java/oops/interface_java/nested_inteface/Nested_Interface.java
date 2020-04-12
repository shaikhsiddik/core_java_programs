package com.ssquare.java.oops.interface_java.nested_inteface;


public class Nested_Interface implements New_Nested_Interface, Test_Nested_Interface {
    public static void main(String[] args){
        Nested_Interface nested_interface = new Nested_Interface();
        nested_interface.NewNested();
        nested_interface.TestNested();
    }

    @Override
    public void NewNested() {
        System.out.println("Message From New Nested Interface");
    }

    @Override
    public void TestNested() {
        System.out.println("Message From Test Nested Interface");
    }
}

/*
Output of above program will be:
Message From New Nested Interface
Message From Test Nested Interface

Process finished with exit code 0
 */