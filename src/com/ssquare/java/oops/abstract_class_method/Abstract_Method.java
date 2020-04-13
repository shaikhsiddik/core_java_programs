package com.ssquare.java.oops.abstract_class_method;

import java.util.Scanner;

public class Abstract_Method {
    public static void main(String[] args){
        Triangle triangle = new Triangle();
        Rectangle rectangle = new Rectangle();
        triangle.readDimension();
        rectangle.readDimension();
        float area_One = triangle.findArea();
        float area_Two = rectangle.findArea();
        System.out.println("Area of Triangle is :"+area_One);
        System.out.println("Area of Rectangle is :"+area_Two);
    }
}

abstract class Shape{
    float dimension_one, dimension_two;
    Scanner scanner = new Scanner(System.in);
    void readDimension(){
        System.out.println("Enter Dimension One");
        dimension_one = scanner.nextFloat();
        System.out.println("Enter Dimension Two");
        dimension_two = scanner.nextFloat();
    }
    abstract float findArea();
}

class Triangle extends Shape{

    @Override
    float findArea() {
        return 0.5f * dimension_one * dimension_two;
    }
}

class Rectangle extends Shape{

    @Override
    float findArea() {
        return dimension_one * dimension_two;
    }
}

/*
Output of above Program will be:
Enter Dimension One
12.5
Enter Dimension Two
10.2
Enter Dimension One
12.5
Enter Dimension Two
20.2
Area of Triangle is :63.75
Area of Rectangle is :252.50002

 */

