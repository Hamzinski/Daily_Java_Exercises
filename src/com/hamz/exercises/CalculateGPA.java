package com.hamz.exercises;

import java.util.Scanner;

public class CalculateGPA {
    public static void main(String[] args) {

        int quiz, visa, ffinal;
        double average;

        System.out.println("Enter the quiz grade: ");
        Scanner input = new Scanner(System.in);
        quiz = input.nextInt();
        System.out.println("Enter the visa grade: ");
        visa = input.nextInt();
        System.out.println("Enter the final grade: ");
        ffinal = input.nextInt();

        average = quiz*0.2 + visa*0.35 + ffinal*0.45;
        System.out.println("Your average: " + average);
        String result = (average>=50) ? ("You passed.") : ("You failed.");
        System.out.println(result);
    }
}
