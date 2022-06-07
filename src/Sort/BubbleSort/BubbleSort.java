package Sort.BubbleSort;

import Sort.ArrayTools.ArrayTools;

public class BubbleSort {



    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    ArrayTools.swap(array, j, j+1);
                }
            }
        }
    }
    public static void bubbleSortPerformance(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length -i - 1; j++) {

                if (array[j] > array[j + 1]) {
                    ArrayTools.swap(array, j, j+1);
                }
            }
        }
    }




}
