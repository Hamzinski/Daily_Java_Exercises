package com.hamz.exercises;
import java.util.Scanner;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the text:");
        String text = scanner.nextLine();

        System.out.println("Enter the word to search for:");
        String wordToSearch = scanner.nextLine();

        int frequency = countWordFrequency(text, wordToSearch);
        System.out.println("The word '" + wordToSearch + "' occurs " + frequency + " times in the given text.");

        scanner.close();
    }

    public static int countWordFrequency(String text, String word) {
        // Normalize the text and word to lowercase
        text = text.toLowerCase();
        word = word.toLowerCase();

        // Split the text into words
        String[] words = text.split("\\s+");

        int count = 0;
        for (String w : words) {
            if (w.equals(word)) {
                count++;
            }
        }
        return count;
    }
}
