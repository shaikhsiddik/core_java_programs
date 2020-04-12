package com.ssquare.java.oops.interface_java;

public class Example_Interface implements Test_Interface {
    public static void main(String[] args){
        Example_Interface example_interface = new Example_Interface();
        example_interface.setupOne();
        example_interface.setupTwo();
        example_interface.setupThree();
    }

    @Override
    public void setupOne() {
        System.out.println("Message From Setup One");
    }

    @Override
    public void setupTwo() {
        System.out.println("Message From Setup Two");
    }

    @Override
    public void setupThree() {
        System.out.println("Message From Setup Three");
    }
}

/*
Output of above Program will be:
Message From Setup One
Message From Setup Two
Message From Setup Three

Process finished with exit code 0

 */