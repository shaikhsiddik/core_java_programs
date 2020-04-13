package com.ssquare.java.oops.abstract_class_method;

public class Abstract_Class {
    public static void main(String[] args){
        Human human = new Human();
        human.breath();
        human.walk();
        human.eat();
    }
}

abstract class LivingThings{
    void breath(){
        System.out.println("Living Things breath");
    }
    void eat(){
        System.out.println("Living Things eat");
    }
}

class Human extends LivingThings{
    void walk(){
        System.out.println("Human walk");
    }
}

/*
Output of above Program will be:

Living Things breath
Human walk
Living Things eat

 */