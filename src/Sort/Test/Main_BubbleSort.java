package Sort.Test;

import Sort.ArrayTools.ArrayTools;
import Sort.BubbleSort.BubbleSort;

public class Main_BubbleSort {
    public static void main(String[] args) {
        int array[] = {7,1,2,5,4,3};

        System.out.print("Before: ");
        ArrayTools.printArray(array);

        BubbleSort.bubbleSort(array);

        System.out.print("After:  ");
        ArrayTools.printArray(array);

        System.out.println("Bubble Sort has " + BubbleSort.getCount() + " loops");

        array = new int[]{7, 1, 2, 5, 4, 3};

        System.out.print("Before: ");
        ArrayTools.printArray(array);

        BubbleSort.bubbleSortPerformance(array);

        System.out.print("After:  ");
        ArrayTools.printArray(array);

        System.out.println("Bubble Sort Performance has " + BubbleSort.getCount() + " loops");
    }
}
