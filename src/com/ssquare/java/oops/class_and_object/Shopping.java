package com.ssquare.java.oops.class_and_object;

public class Shopping {
    public static void main(String[] args){
        Product product = new Product();
        // setting Data
        product.setProduct_id(101);
        product.setProduct_name("Oil");
        product.setProduct_price(95);

        // getting Data
        System.out.println("Product Id :"+product.getProduct_id());
        System.out.println("Product Name :"+product.getProduct_name());
        System.out.println("Product Price :"+product.getProduct_price());
    }
}

/*
Output of above Program will be:
Product Id :101
Product Name :Oil
Product Price :95

Process finished with exit code 0
 */