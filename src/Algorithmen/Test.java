package Algorithmen;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // Algorithm
        // 1. birthdate
        // 2. age = current year - birthdate
        // 3. display the age

        // Pseudo code
        // 1. input / read birthdate
        // 2. currentYear <- 2022
        // 3. age <- currentYear - birthdate
        // 4. ausgabe age

        // Code
        // 1. input / read birthdate
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Birthdate");
        int birthdate = sc.nextInt();
        // 2. currentYear
        int currentYear = LocalDate.now().getYear();
        // 3. age <- currentYear - birthdate
        int age = currentYear - birthdate;
        // 4. ausgabe age
        System.out.println("You are " + age + " years old!");


    }
}
