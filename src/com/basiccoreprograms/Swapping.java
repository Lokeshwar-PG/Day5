package com.basiccoreprograms;

import java.util.Scanner;

public class Swapping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value: ");
        int a = sc.nextInt();
        System.out.println("Enter b value: ");
        int b = sc.nextInt();
        System.out.println("Before swapping a="+a+" b="+b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping a="+a+" b="+b);
    }
}
