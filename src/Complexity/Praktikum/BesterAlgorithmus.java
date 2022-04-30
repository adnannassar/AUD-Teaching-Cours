package Complexity.Praktikum;

public class BesterAlgorithmus {
    // 1000 * n
    public static double g1(int n) {
        return 1000 * n;
    }

    // 100n * log2(n+1)
    public static double g2(int n) {
        return 100 * n * Math.log((n + 1));
    }

    // 10 * n * n
    public static double g3(int n) {
        return 10 * n * n;
    }

    // n * n * n
    public static double g4(int n) {
        return n * n * n;
    }

    // 2 hoch n
    public static double g5(int n) {
        // TODO
        return Math.pow(2, n);
    }

    // n!
    public static double g6(int n) {
        return fak(n);
    }

    public static double fak(int n) {
        double summe = 1;
        for (int i = 1; i <= n; i++) {
            summe *= i;
        }
        return summe;
    }


    public static double f1(int n) {
        return 4 * n + 32;
    }

    public static double f2(int n) {
        return 6 * n;
    }

    public static double f3(int n) {
        return n * n;
    }

    // Bestimmt fuer alle 6 Funktionen den Wert von
    // gi(n) und gibt den Index der Funktion mit
    // dem minimalen Wert zurueck
    //5
    public static int gewinnerFuerN(int n) {
        // TODO
        double[] algorithmen = new double[3];
        algorithmen[0] = f1(n);
        algorithmen[1] = f2(n);
        algorithmen[2] = f3(n);

        double min = algorithmen[0];
        int index = 0;
        for (int i = 0; i < algorithmen.length; i++) {
            if (algorithmen[i] < min) {
                min = algorithmen[i];
                index = i;
            }
        }

        return index;
    }

    // Gibt für jede Zahl n zwischen 1 und 2000 aus, welcher der
    // 6 Algorithmen (A1 .. A6) für das betrachtete n der Beste ist
    public static void main(String[] args) {
        // TODO
        for (int i = 1; i <= 30; i++) {
            System.out.println("Für n = " + i + " --> F" + (gewinnerFuerN(i) + 1) + " is the best Algorithm");
        }
    }
}