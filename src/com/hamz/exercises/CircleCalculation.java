package com.hamz.exercises;

import java.util.Scanner;

public class CircleCalculation {
    public static void main(String[] args) {
        int radius;
        double area, volume, pi = 3.14;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the circle radius:");
        radius = input.nextInt();
        area = 2 * pi * radius;
        volume = pi * (radius * radius);
        System.out.println("Circle area: " + area);
        System.out.println("Circle volume: " + volume);
    }
}
