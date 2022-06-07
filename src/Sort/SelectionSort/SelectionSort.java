package Sort.SelectionSort;

import Sort.ArrayTools.ArrayTools;

public class SelectionSort {
    public static void selectionSort(int[] array) {
        for(int i = 0 ; i < array.length; i++){
           int minIndex = i;
           for( int j = i + 1 ; j < array.length ; j++){
               if(array[j] < array[minIndex]){
                   minIndex = j;
               }
           }
           ArrayTools.swap(array, i, minIndex);
        }
    }

    public static int findMin(int[] array) {
        // annahme
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int findMinIndex(int[] array) {
        // annahme
        int minIndex = 0;
        int min = array[minIndex];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
}
