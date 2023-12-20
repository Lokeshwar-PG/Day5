package com.functionalprograms;

import java.util.Scanner;

public class WindChill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the temperature in Fahrenheit (less than 50 in absolute value): ");
        double t = scanner.nextDouble();

        System.out.print("Enter the wind speed in miles per hour (between 3 and 120): ");
        double v = scanner.nextDouble();

        scanner.close();

        if (Math.abs(t) > 50 || v > 120 || v < 3) {
            System.out.println("Invalid input. Temperature must be less than 50 in absolute value, and wind speed must be between 3 and 120.");
            return;
        }

        double windChill = calculateWindChill(t, v);
        System.out.println("Wind chill: " + windChill);
    }

    private static double calculateWindChill(double t, double v) {
        return 35.74 + (0.6215 * t) + (((0.4275 * t) - 35.75) * Math.pow(v, 0.16));
    }
}
