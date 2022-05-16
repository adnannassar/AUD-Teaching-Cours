package Algorithmen.Aufgabe_1;

public class Fibonaci {
    public static void main(String[] args) {
        fibo(15);

    }

    public static void fibo(int n) {
        int a = 1, b = 1;
        int result = 0 ;
        System.out.print(a +" " + b +" ");
        for (int i = 2; i < n; i++) {
            result = a + b;
            System.out.print(result + " ");
            a = b;
            b = result;
        }
    }
}
