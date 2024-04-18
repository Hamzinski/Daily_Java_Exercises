package com.hamz.exercises;

import java.util.Scanner;

public class CalculateKDV {
    public static void main(String[] args) {

        double total, pricewithkdv, kdv= 0.18;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount of the product.");
        total = input.nextDouble();
        pricewithkdv = total + total*kdv;
        System.out.println("Price of the product with KDV: " + pricewithkdv);
    }
}
