package com.ssquare.java.strings.string_class;

import java.util.Scanner;

public class Extracting_Character {
    public static void main(String[] args){
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Any String");
        String str = scanner.next();
        for (int i=0; i<str.length();i++){
            switch (str.charAt(i)){
                case 'a':
                    System.out.println("Vowels a found");
                    break;
                case 'e':
                    System.out.println("Vowels e found");
                    break;
                case 'i':
                    System.out.println("Vowels i found");
                    break;
                case 'o':
                    System.out.println("Vowels o found");
                    break;
                case 'u':
                    System.out.println("Vowels u found");
                    break;
                default:
                    break;
            }
        }
    }
}

/*
Output of above Program will be:
Enter Any String
sonali
Vowels o found
Vowels a found
Vowels i found
 */