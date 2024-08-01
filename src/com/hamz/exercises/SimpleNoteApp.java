package com.hamz.exercises;
import java.util.ArrayList;
import java.util.Scanner;

public class SimpleNoteApp {
    private static ArrayList<String> notes = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Simple Note App");
            System.out.println("1. Add a note");
            System.out.println("2. View a note");
            System.out.println("3. List all notes");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    addNote(scanner);
                    break;
                case 2:
                    viewNote(scanner);
                    break;
                case 3:
                    listNotes();
                    break;
                case 4:
                    System.out.println("Exiting the application.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }

    private static void addNote(Scanner scanner) {
        System.out.print("Enter your note: ");
        String note = scanner.nextLine();
        notes.add(note);
        System.out.println("Note added.");
    }

    private static void viewNote(Scanner scanner) {
        System.out.print("Enter the note index to view: ");
        int index = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        if (index >= 0 && index < notes.size()) {
            System.out.println("Note " + index + ": " + notes.get(index));
        } else {
            System.out.println("Invalid index.");
        }
    }

    private static void listNotes() {
        if (notes.isEmpty()) {
            System.out.println("No notes available.");
        } else {
            for (int i = 0; i < notes.size(); i++) {
                System.out.println(i + ": " + notes.get(i));
            }
        }
    }
}
