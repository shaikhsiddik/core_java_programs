package com.ssquare.java.oops.inheritance.hierarchical;

public class Hierarchical_Inheritance {
    public static void main(String[] args){
        B b = new B();
        C c = new C();
        D d = new D();

        b.methodA();
        c.methodA();
        d.methodA();
    }
}

class A{
    public void methodA(){
        System.out.println("Method of Class A");
    }
}

class B extends A{
    public void methodB(){
        System.out.println("Method of Class B");
    }
}

class C extends A{
    public void methodC(){
        System.out.println("Method of Class C");
    }
}

class D extends A{
    public void methodD(){
        System.out.println("Method of Class D");
    }
}

/*
Output of above Program will be:
Method of Class A
Method of Class A
Method of Class A

 */