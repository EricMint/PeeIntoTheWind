package algorithm;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int array[] = {11, 32, 22, 44, 39, 99, 87, 64, 88};
        insertionSort(array);
    }

    private static void insertionSort(int array[]) {
        System.out.println(Arrays.toString(array));
        int length = array.length;
        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (array[j - 1] < array[j]) {
                    break;
                }
                int temp = array[j - 1];
                array[j - 1] = array[j];
                array[j] = temp;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
