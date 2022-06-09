package Sort.Test;

import Sort.BubbleSort.BubbleSort;
import Sort.ComplexityCalculator.TimeComplexityCalculator;
import Sort.InsertionSort.InsertionSort;
import Sort.MergeSort.MergeSort;
import Sort.QuickSort.QuickSort;
import Sort.SelectionSort.SelectionSort;

import java.util.Arrays;
import java.util.Random;

public class Compare {
    public static void main(String[] args) {
        TimeComplexityCalculator timeComplexityCalculator = new TimeComplexityCalculator();
        Random random = new Random();
        int[] quelle = new int[1000000];

        for (int i = 0; i < 1000000; i++) {
            quelle[i] = random.nextInt(-1000000, 1000000);
        }

        int array[] = Arrays.copyOf(quelle, 1000);
        timeComplexityCalculator.start();
        BubbleSort.bubbleSort(array);
        timeComplexityCalculator.end();
        System.out.println("Bubble sort hat " + timeComplexityCalculator.getDuration() / 1000 + " ms gedauert");

        array = Arrays.copyOf(quelle, 1000);
        timeComplexityCalculator.start();
        SelectionSort.selectionSort(array);
        timeComplexityCalculator.end();
        System.out.println("Selection Sort sort hat " + timeComplexityCalculator.getDuration() / 1000 + " ms gedauert");

        array = Arrays.copyOf(quelle, 1000);
        timeComplexityCalculator.start();
        InsertionSort.insertionSort(array);
        timeComplexityCalculator.end();
        System.out.println("Insertion Sort sort hat " + timeComplexityCalculator.getDuration() / 1000 + " ms gedauert");

        array = Arrays.copyOf(quelle, 1000);
        timeComplexityCalculator.start();
        MergeSort.mergeSort(array);
        timeComplexityCalculator.end();
        System.out.println("Merge Sort sort hat " + timeComplexityCalculator.getDuration() / 1000 + " ms gedauert");

        array = Arrays.copyOf(quelle, 1000);
        timeComplexityCalculator.start();
        QuickSort.quickSort(array, 0, array.length - 1);
        timeComplexityCalculator.end();
        System.out.println("QuickSort Sort sort hat " + timeComplexityCalculator.getDuration() / 1000 + " ms gedauert");


    }
}
