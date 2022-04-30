package Complexity.Praktikum;

public class ComplexityTest {
    public static void main(String[] args) {
        //{10, 5, 2, 1, 7, -10, 29, 0} --> {-10, 0, 1, 2, 5, 7, 10 , 29}
        int n = 100;
        Zeitmessung zeitmessung = new Zeitmessung();
        StopUhr stopUhr = new StopUhr();

        stopUhr.start();
        zeitmessung.func1(n);
        stopUhr.stop();
        System.out.println("Für n = " + n + " Fun1 (Linear) hat " + (stopUhr.getDuration() / 1000) + " ms gedauert");

        stopUhr.start();
        zeitmessung.func2(n);
        stopUhr.stop();
        System.out.println("Für n = " + n + " Fun2 hat (Quadratisch) " + (stopUhr.getDuration() / 1000) + " ms gedauert");

        stopUhr.start();
        zeitmessung.func6(n);
        stopUhr.stop();
        System.out.println("Für n = " + n + " Fun6 hat (Log2(n)) " + (stopUhr.getDuration() / 1000) + " ms gedauert");


    }

}
