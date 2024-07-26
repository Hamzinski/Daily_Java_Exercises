package com.hamz.exercises;
import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first word or phrase: ");
        String firstInput = scanner.nextLine().replaceAll("\\s+", "").toLowerCase();

        System.out.print("Enter the second word or phrase: ");
        String secondInput = scanner.nextLine().replaceAll("\\s+", "").toLowerCase();

        boolean isAnagram = checkAnagram(firstInput, secondInput);

        if (isAnagram) {
            System.out.println("The inputs are anagrams.");
        } else {
            System.out.println("The inputs are not anagrams.");
        }

        scanner.close();
    }

    public static boolean checkAnagram(String first, String second) {
        if (first.length() != second.length()) {
            return false;
        }

        char[] firstArray = first.toCharArray();
        char[] secondArray = second.toCharArray();

        Arrays.sort(firstArray);
        Arrays.sort(secondArray);

        return Arrays.equals(firstArray, secondArray);
    }
}
