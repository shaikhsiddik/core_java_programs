package com.ssquare.java.oops.inner_classes;

public class Anonymous_Inner_Classes {
    static Demo demo = new Demo(){
      void show(){
          super.show();
          System.out.println("Show method in Anonymous inner classes");
      }
    };

    public static void main(String[] args){
        demo.show();
    }
}

class Demo{
    void show(){
        System.out.println("Show Method is Super method...");
    }
}

/*
Output of above Program will be:
Show Method is Super method...
Show method in Anonymous inner classes

Process finished with exit code 0
 */
