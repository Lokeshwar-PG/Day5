package com.basiccoreprograms;

import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char alphabet = sc.next().charAt(0);
        switch (alphabet) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Consonant");
        }
    }
}
