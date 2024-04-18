package com.hamz.exercises;

import java.util.Scanner;

public class GettingDataFromConsole {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        /*
        int a, b;
        System.out.println("Enter the number A: ");
        a = input.nextInt();
        System.out.println("Enter the number B: ");
        b = input.nextInt();
        System.out.println("Numbar A :" + a);
        System.out.println("Numbar B :" + b);
        */

        /*
        double c;
        System.out.println("Enter a number of type Double: ");
        c = input.nextDouble();
        System.out.println("Number C:" + c);
        */

        String str;
        str = input.nextLine();
        System.out.println(str);


    }

}
