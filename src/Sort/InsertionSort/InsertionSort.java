package Sort.InsertionSort;

import Sort.ArrayTools.ArrayTools;

public class InsertionSort {
    public static void insertionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j > 0; j--) {
                if (array[j] < array[j - 1]) {
                    ArrayTools.swap(array, j, j - 1);
                }
            }
        }
    }
}
