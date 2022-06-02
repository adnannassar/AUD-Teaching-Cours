package Sort.BubbleSort;

public class BubbleSort {

    private static int count = 0 ;

    public static void bubbleSort(int[] array) {
        count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                count++;
                if (array[j] > array[j + 1]) {
                    swap(array, j, j+1);
                }
            }
        }
    }
    public static void bubbleSortPerformance(int[] array) {
        count = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length -i - 1; j++) {
                count++;
                if (array[j] > array[j + 1]) {
                    swap(array, j, j+1);
                }
            }
        }
    }
    private static void swap(int array[] , int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static int getCount(){
        return count;
    }

}
