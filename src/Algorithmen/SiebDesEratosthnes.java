package Algorithmen;

import java.util.Scanner;

public class SiebDesEratosthnes {
    public static void main(String[] args) {
        SiebDesEratosthnes.showPrimeNumber();
    }

    static Scanner sc;
    static int[] numbers;

    public static void showPrimeNumber() {
        sc = new Scanner(System.in);
        System.out.println("Bitte die Nummer einegene:");
        int n = sc.nextInt();
        numbers = new int[n];
        for (int i = 1; i <= n; i++) {
            hischreiben(i);
        }
        durchstreichen(1);
        int a = 2;
        while ((a * a) <= n) {
            if (!isDurchgestrichen(a)) {
                durchstreichenVielfache(a, n);
            }
            a++;
        }
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] != -1)
                System.out.print(numbers[i] + "\t");
        }
    }

    private static void durchstreichenVielfache(int a, int n) {
        for (int i = a; i <= n; i += a) {
            if (i != a)
                durchstreichen(i);
        }
    }

    private static boolean isDurchgestrichen(int a) {
       return numbers[a-1] == -1;
    }

    private static void durchstreichen(int a) {
        numbers[a - 1] = -1;
    }

    private static void hischreiben(int i) {
        numbers[i - 1] = i;
    }
}
