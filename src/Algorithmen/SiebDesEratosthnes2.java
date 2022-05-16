package Algorithmen;

import java.util.Scanner;


public class SiebDesEratosthnes2 {
    private static int[] array;

    public static void main(String[] args) {
        findPrimeNumbers();
    }

    private static void findPrimeNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte n eingeben: ");
        int n = scanner.nextInt();
        array = new int[n];

        for (int a = 1; a <= n; a++) {
            hinschreiben(a);
        }
        durchstreichen(1);
        int a = 2;
        while (a * a <= n) {
            if (!istDurchgestrichen(a)) {
                durchstreichenVielfache(a);
            }
            a = a + 1;
        }
        ausgabePrimeNumber();


    }

    private static void ausgabePrimeNumber() {
        for (int a = 1; a <= array.length; a++) {
                if(!istDurchgestrichen(a)){
                    System.out.print(array[a - 1] + " ");
                }
        }
    }

    private static void durchstreichenVielfache(int a) {
        for (int i = a * 2; i <= array.length; i += a) {
            if (a * a <= array.length) {
                durchstreichen(i);
            }
        }
    }

    private static void hinschreiben(int a) {
        array[a - 1] = a;
    }

    private static void durchstreichen(int a) {
        array[a - 1] = 0;
    }

    private static boolean istDurchgestrichen(int a) {
        if (array[a - 1] == 0) {
            return true;
        } else {
            return false;
        }
    }

}
