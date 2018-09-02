package algorithm;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int array[] = {11, 32, 22, 44, 39, 99, 87, 64, 88};
        bubbleSort(array);
    }

    private static void bubbleSort(int array[]) {
        System.out.println(Arrays.toString(array));
        int length = array.length;
        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
