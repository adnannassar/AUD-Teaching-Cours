package Algorithmen;

import java.util.Scanner;

public class SiebDesEratonsthnesBoolean {

    private static boolean[] array;
    private static int n;

    public static void main(String[] args) {
        primZahl();

    }
    public static  void primZahl() {
        //einlesen
        System.out.println("Bitte Zahl eingeben: ");
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        array = new boolean[n];
        durchstreichen(1);
        int a=2;
        while((a*a) <= n){
            if(!istDurchgestrichen(a)){
                durstreicheVielfache(a,n);
            }
            a++;
        }
        printArray();
    }


    public static  void durchstreichen(int a) {
        array[a - 1] = true;
    }

    public static void durstreicheVielfache(int a, int n) {
        for (int i = a; i <= n; i+= a) {
            if (i != a) {
                durchstreichen(i);
            }
        }
    }

    public static boolean istDurchgestrichen(int a) {
        if (array[a - 1] == true) {
            return true;
        }
        return false;

    }
    public static void  printArray(){
        for (int i = 1; i <= n; i++) {
            if(!istDurchgestrichen(i))
                System.out.print(i+ " ");
        }
    }
}
