package Sort.QuickSort;

import Sort.ArrayTools.ArrayTools;

public class QuickSort {
    public static void quickSort(int array[], int start, int end) {
        if (start >= end) {
            return;
        } else {
            int middle = start + (end - start) / 2;
            int pivot = array[middle];
            int l = start;
            int r = end;

            while (l <= r) {
                while (array[l] < pivot) {
                    l++;
                }

                while (array[r] > pivot) {
                    r--;
                }

                if (l <= r) {
                    ArrayTools.swap(array, l, r);
                    l++;
                    r--;
                }
            }
            if (start < r) {
                quickSort(array, start, r);
            }
            if (l < end) {
                quickSort(array, l, end);
            }

        }
    }
}
