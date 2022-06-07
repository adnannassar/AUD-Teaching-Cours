package Sort.Test;

import Sort.ArrayTools.ArrayTools;
import Sort.BubbleSort.BubbleSort;
import Sort.ComplexityCalculator.TimeComplexityCalculator;
import Sort.MergeSort.MergeSort;

import javax.swing.*;
import java.util.LinkedList;

public class Main_MergeSort {
    static int array1[] = {7, 1, 2, 5, 4, 3};
    static int array2[] = {-15, 10, 8, 9, 0, 6, -20, 30};

    public static void main(String[] args) {
        TimeComplexityCalculator timeComplexityCalculator = new TimeComplexityCalculator();

        System.out.print("Before: ");
        ArrayTools.printArray(array1);
        timeComplexityCalculator.start();
        MergeSort.mergeSort(array1);
        timeComplexityCalculator.end();

        System.out.print("After:  ");
        ArrayTools.printArray(array1);
        System.out.println("MergeSort sort hat " + timeComplexityCalculator.getDuration() / 1000 + " ms gedauert");



    }

    private static void TestTeilApart() {
        LinkedList<int[]> list = MergeSort.teilAPart(array1);
        for (int[] a : list) {
            if (a.length == 1) {
                System.out.print("[" + a[0] + "]");
            }
            System.out.print(" ");
        }
    }
}
