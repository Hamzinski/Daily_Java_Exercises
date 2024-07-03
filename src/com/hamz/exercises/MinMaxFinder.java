package com.hamz.exercises;

public class MinMaxFinder {
    public static void main(String[] args) {
        int[] numbers = {15, 22, 8, 19, 31, 5, 42, 13};
        int min = findMin(numbers);
        int max = findMax(numbers);

        System.out.println("Array: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
        System.out.println("Minimum Value: " + min);
        System.out.println("Maximum Value: " + max);
    }

    public static int findMin(int[] array) {
        int min = array[0];
        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static int findMax(int[] array) {
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}