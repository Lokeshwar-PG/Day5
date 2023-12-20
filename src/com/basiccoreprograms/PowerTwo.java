package com.basiccoreprograms;

import java.util.Scanner;

import static java.lang.Math.pow;

public class PowerTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("Enter the value 0 to 31:");
            int n = sc.nextInt();
            if(n<1 || n>31) {
                System.out.println("The given value not in range.");
            }
            else {
                for(int i=1; i<=n; i++) {
                    double power = pow(2,i);
                    String checkLeap = isLeapYear(power);
                    System.out.println("2^"+i+"="+power+" - "+checkLeap);
                }
                break;
            }
        }
    }

    public static String isLeapYear(double year) {
        if(year%400==0) {
            return "The year is leap year";
        }
        else if(year%100!=0 && year%4==0) {
            return "The year is leap year";
        }
        else {
            return "The year is not a leap year";
        }
    }
}
