package Algorithmen.Aufgabe_1;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number base: ");
        int base = sc.nextInt();
        System.out.println("Enter the number exponent: ");
        int exponent = sc.nextInt();

        System.out.println(powerToNumber(base, exponent));

    }

    public static long powerToThree(long a) {
        return a * a * a * a;
    }

    public static long powerToNumber(int base, int exponent) {
        long result = 1;
        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }
        return result;
    }
}
