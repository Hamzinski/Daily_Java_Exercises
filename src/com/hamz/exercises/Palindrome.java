package com.hamz.exercises;

public class Palindrome {
    public static void main(String[] args) {
        int num1 = 121;
        int num2 = -1226;
        System.out.println(num1 + " is a palindrome: " + isPalindrome(num1));
        System.out.println(num2 + " is a palindrome: " + isPalindrome(num2));
    }

    public static boolean isPalindrome(int number) {
        boolean isNegative = number < 0;
        number = Math.abs(number);
        int originalNumber = number;
        int reversedNumber = 0;
        while (number > 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        if (isNegative && reversedNumber != originalNumber) {
            return false;
        }
        return originalNumber == reversedNumber;
    }
}

