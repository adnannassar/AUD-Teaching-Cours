package Sort.Test;

import Sort.ArrayTools.ArrayTools;
import Sort.ComplexityCalculator.TimeComplexityCalculator;
import Sort.QuickSort.QuickSort;
import Sort.SelectionSort.SelectionSort;

public class Main_QuickSort {
    public static void main(String[] args) {
        TimeComplexityCalculator timeComplexityCalculator = new TimeComplexityCalculator();
        int array[] = {7, 1, 2, -5, 4, 3};

        System.out.print("Before: ");
        ArrayTools.printArray(array);
        timeComplexityCalculator.start();
        QuickSort.quickSort(array, 0, array.length - 1);
        timeComplexityCalculator.end();

        System.out.print("After:  ");
        ArrayTools.printArray(array);
        System.out.println("QuickSort sort hat " + timeComplexityCalculator.getDuration() / 1000 + " ms gedauert");


    }
}
