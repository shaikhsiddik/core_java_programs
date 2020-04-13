package com.ssquare.java.strings.string_class;

public class SubString {
    public static void main(String[] args){
        String language = "Java Language";
        String topic = "Object Oriented Programming";
        System.out.println("Language SubString :"+language.substring(6));
        System.out.println("Topic SubString :"+topic.substring(3,10));
    }
}

/*
Output of above Program will be:
Language SubString :anguage
Topic SubString :ect Ori
 */