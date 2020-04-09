package com.ssquare.java.oops.inner_classes;

public class Nested_Inner_Classes {
    public static void main(String[] args){
        Home.InsideHome insideHome = new Home().new InsideHome();
        insideHome.Room();
    }
}

class Home{
    class InsideHome{
        public void Room(){
            System.out.println("Welcome Home..");
        }
    }
}

/*
Output of above Program will be:
Welcome Home..

Process finished with exit code 0
 */