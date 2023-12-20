package com.functionalprograms;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter (x,y) values");
        int x = sc.nextInt();
        int y = sc.nextInt();
        double euclideanDistance = sqrt(x*x+y*y);
        System.out.println("The Euclidean Distance: "+euclideanDistance);

    }
}
