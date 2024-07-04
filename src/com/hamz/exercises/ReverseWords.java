package com.hamz.exercises;

public class ReverseWords {
    public static void main(String[] args) {
        String sentence = "Hello World from Java";
        String reversedSentence = reverseWordsInSentence(sentence);

        System.out.println("Original Sentence: " + sentence);
        System.out.println("Reversed Words Sentence: " + reversedSentence);
    }

    public static String reverseWordsInSentence(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder reversedSentence = new StringBuilder();

        for (String word : words) {
            String reversedWord = new StringBuilder(word).reverse().toString();
            reversedSentence.append(reversedWord).append(" ");
        }

        return reversedSentence.toString().trim();
    }
}

