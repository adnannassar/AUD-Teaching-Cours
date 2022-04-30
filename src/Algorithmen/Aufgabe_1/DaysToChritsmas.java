package Algorithmen.Aufgabe_1;

import java.util.Scanner;

public class DaysToChritsmas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day");
        int day = sc.nextInt();
        System.out.println("Enter the month");
        int month = sc.nextInt();

        calculateDaysToChristmas(day, month);
    }


    public static void calculateDaysToChristmas(int day, int month) {
        int dayNumber = 24 - day;
        System.out.println(dayNumber);
        int totalDaysInMonths = 0;
        if (month < 12) {
            for (int i = month; i <= 12; i++) {
                totalDaysInMonths += daysInMonth(i);
            }
        }

        int result = dayNumber + totalDaysInMonths;
        System.out.println("Days to Christmas:" + result);
    }


    public static int daysInMonth(int month) {
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12:
                return 31;
            case 4, 6, 9, 11:
                return 30;
            default:
                return 28;
        }
    }

}
