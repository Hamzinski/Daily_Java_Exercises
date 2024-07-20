package com.hamz.exercises;
import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a message to encrypt: ");
        String message = scanner.nextLine();
        System.out.print("Enter the shift value: ");
        int shift = scanner.nextInt();

        String encryptedMessage = encrypt(message, shift);
        System.out.println("Encrypted Message: " + encryptedMessage);
        scanner.close();
    }

    public static String encrypt(String message, int shift) {
        StringBuilder encrypted = new StringBuilder();
        for (char character : message.toCharArray()) {
            if (Character.isLetter(character)) {
                char shifted = (char) (character + shift);
                if (Character.isLowerCase(character)) {
                    if (shifted > 'z') {
                        shifted -= 26;
                    }
                } else if (Character.isUpperCase(character)) {
                    if (shifted > 'Z') {
                        shifted -= 26;
                    }
                }
                encrypted.append(shifted);
            } else {
                encrypted.append(character);
            }
        }
        return encrypted.toString();
    }
}

