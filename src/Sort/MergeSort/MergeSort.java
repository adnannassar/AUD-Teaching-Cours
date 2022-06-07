package Sort.MergeSort;

import java.util.LinkedList;

public class MergeSort {
    public static int origArray[];
    public static int tempArray[];

    public static void  mergeSort(int[] array){
        origArray = array;
        tempArray = new int[array.length];
        doMergeSort(0, origArray.length - 1);
    }
    private static void doMergeSort(int startIndex, int stopIndex) {
        if (startIndex < stopIndex) {
            int middle = startIndex + (stopIndex - startIndex) / 2;

            // from start index to middle index
            doMergeSort(startIndex, middle);

            // from middle index to end index
            doMergeSort(middle + 1, stopIndex);

            // merge the parts
            mergeParts(startIndex, middle, stopIndex);
        }
    }
    private static void mergeParts(int startIndex, int middle, int stopIndex){
        for(int i = startIndex ; i<= stopIndex; i++){
            tempArray[i] = origArray[i];
        }
        int i = startIndex;
        int j = middle+1;
        int k = startIndex;
        while(i <= middle && j <= stopIndex){
            if(tempArray[i] <= tempArray[j]){
                origArray[k] = tempArray[i];
                i++;
            }else{
                origArray[k] = tempArray[j];
                j++;
            }
            k++;
        }
        while(i <= middle){
            origArray[k] = tempArray[i];
            k++;
            i++;
        }
    }

    public static int[] merge(int[] array1, int[] array2) {
        int[] mergedArray = new int[array1.length + array2.length];
        for (int i = 0; i < array1.length; i++) {
            mergedArray[i] = array1[i];
        }
        for (int i = array1.length, j = 0; j < array2.length; i++, j++) {
            mergedArray[i] = array2[j];
        }
        return mergedArray;
    }
    public static LinkedList<int[]> teilAPart(int[] array) {
        LinkedList<int[]> list = new LinkedList<>();
        for (int i = 0; i < array.length; i++) {
            list.add(new int[]{array[i]});
        }
        return list;
    }
}
