package com.hamz.exercises;
import java.util.Scanner;
import java.util.Calendar;

public class CalendarGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the year: ");
        int year = scanner.nextInt();

        System.out.print("Enter the month (1-12): ");
        int month = scanner.nextInt();

        printMonthCalendar(year, month);
        scanner.close();
    }

    public static void printMonthCalendar(int year, int month) {
        // Create a Calendar instance
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, 1);

        // Get the first day of the month (0=Sunday, 1=Monday, ..., 6=Saturday)
        int firstDayOfWeek = calendar.get(Calendar.DAY_OF_WEEK) - 1;

        // Get the number of days in the month
        int daysInMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

        // Print the calendar header
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // Print leading spaces for the first week
        for (int i = 0; i < firstDayOfWeek; i++) {
            System.out.print("    ");
        }

        // Print the days of the month
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%3d ", day);
            if ((day + firstDayOfWeek) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }
}
