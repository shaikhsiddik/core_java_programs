package com.ssquare.java.oops.class_and_object;

// Basic Example
public class LibSystem {
    public static void main(String[] args){
        int x; // non-static variable
        Book book; // Reference variable not object but it hold's the reference of book object.
        book = new Book();
        System.out.println("Book Name :"+book.name);
        System.out.println("Book Author Name :"+book.author);
        System.out.println("Book Price :"+book.price);
    }
}

/*
Output of above Program will be:
Book Name :Java Programming
Book Author Name :Shaikh Siddik
Book Price :350.75

Process finished with exit code 0
 */