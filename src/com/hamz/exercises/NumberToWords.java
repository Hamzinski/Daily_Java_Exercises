package com.hamz.exercises;

public class NumberToWords {
    public static void main(String[] args) {
        System.out.println("numberToWords(123): " + numberToWords(123));
        System.out.println("numberToWords(1010): " + numberToWords(1010));
        System.out.println("numberToWords(123): " + numberToWords(-123));
    }
    public static String numberToWords(int number) {

        if (number < 0) {
            return "Invalid Value";
        }

        String[] words = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};

        StringBuilder result = new StringBuilder();

        while (number > 0) {
            int digit = number % 10;
            result.insert(0, words[digit] + " ");
            number /= 10;
        }

        return result.toString().trim();
    }
}

