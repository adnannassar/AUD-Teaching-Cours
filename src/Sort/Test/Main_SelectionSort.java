package Sort.Test;

import Sort.ArrayTools.ArrayTools;
import Sort.BubbleSort.BubbleSort;
import Sort.ComplexityCalculator.TimeComplexityCalculator;
import Sort.SelectionSort.SelectionSort;

public class Main_SelectionSort {
    public static void main(String[] args) {
        TimeComplexityCalculator timeComplexityCalculator = new TimeComplexityCalculator();
        int array[] = {7,1,2,-5,4,3};

        System.out.print("Before: ");
        ArrayTools.printArray(array);
        System.out.println("Min: " + SelectionSort.findMin(array));
        System.out.println("Min index : " + SelectionSort.findMinIndex(array));

        timeComplexityCalculator.start();
        SelectionSort.selectionSort(array);
        timeComplexityCalculator.end();

        System.out.print("After:  ");
        ArrayTools.printArray(array);
        System.out.println("Selection sort hat " + timeComplexityCalculator.getDuration() / 1000 + " ms gedauert");


    }
}
