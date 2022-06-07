package Sort.Test;

import Sort.ArrayTools.ArrayTools;
import Sort.ComplexityCalculator.TimeComplexityCalculator;
import Sort.InsertionSort.InsertionSort;
import Sort.SelectionSort.SelectionSort;

public class Main_InsertionSort {
    public static void main(String[] args) {
        TimeComplexityCalculator timeComplexityCalculator = new TimeComplexityCalculator();
        int array[] = {7,1,2,-5,4,3};

        System.out.print("Before: ");
        ArrayTools.printArray(array);

        timeComplexityCalculator.start();
        InsertionSort.insertionSort(array);
        timeComplexityCalculator.end();

        System.out.print("After:  ");
        ArrayTools.printArray(array);
        System.out.println("InsertionSort sort hat " + timeComplexityCalculator.getDuration() / 1000 + " ms gedauert");


    }
}
