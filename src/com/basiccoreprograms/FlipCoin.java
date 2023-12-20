package com.basiccoreprograms;

import java.util.Random;
import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Enter the number of times to flip:");
        int n = sc.nextInt();
        int heads = 0;
        int tails = 0;
        for(int i=0; i<n; i++) {
            int flip = random.nextInt(2);
            if(flip < 0.5) {
                tails++;
            }
            else {
                heads++;
            }
        }
        System.out.println("The percentage of heads and tails respectively is: "+(heads*100/n)+"% and "+(tails*100/n)+"%");
    }
}
